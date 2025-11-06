import cv2
import mediapipe as mp
import math
import winsound

mp_face = mp.solutions.face_detection
mp_draw = mp.solutions.drawing_utils
face_detection = mp_face.FaceDetection(0.5)
cap = cv2.VideoCapture(0)

def beep():
    winsound.Beep(1000, 300)

while True:
    ret, frame = cap.read()
    if not ret:
        break
    frame = cv2.flip(frame, 1)
    rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
    results = face_detection.process(rgb)

    faces = []
    if results.detections:
        for d in results.detections:
            bbox = d.location_data.relative_bounding_box
            h, w, _ = frame.shape
            x, y, bw, bh = int(bbox.xmin*w), int(bbox.ymin*h), int(bbox.width*w), int(bbox.height*h)
            cx, cy = x + bw//2, y + bh//2
            faces.append((cx, cy))
            mp_draw.draw_detection(frame, d)

    if len(faces) >= 2:
        dist = math.dist(faces[0], faces[1])
        cv2.putText(frame, f"Distance: {int(dist)}", (30, 50),
                    cv2.FONT_HERSHEY_SIMPLEX, 1, (0,255,255), 2)
        if dist < 120:        # adjust threshold for your camera
            cv2.putText(frame, "Too close!", (30, 100),
                        cv2.FONT_HERSHEY_SIMPLEX, 1.2, (0,0,255), 3)
            beep()

    cv2.imshow("Proximity Detector", frame)
    if cv2.waitKey(1) & 0xFF == 27:  # ESC to quit
        break

cap.release()
cv2.destroyAllWindows()
