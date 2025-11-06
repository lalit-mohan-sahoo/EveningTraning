import cv2
import threading
import winsound   # works on Windows
import time

# ---------- SETTINGS ----------
BRIGHTNESS_LIMIT = 60      # lower value = more sensitive to darkness
BEEP_FREQ = 1000           # Hz
BEEP_DURATION = 400        # milliseconds
# ------------------------------

def get_brightness(frame):
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    return gray.mean()

def beep_loop(stop_event):
    while not stop_event.is_set():
        winsound.Beep(BEEP_FREQ, BEEP_DURATION)
        time.sleep(0.2)  # short gap between beeps

def main():
    cap = cv2.VideoCapture(0)
    if not cap.isOpened():
        print("Camera not found!")
        return

    beeping = False
    stop_event = None
    beep_thread = None

    print("Press 'q' in window to stop.")

    while True:
        ret, frame = cap.read()
        if not ret:
            continue

        brightness = get_brightness(frame)
        text = f"Brightness: {brightness:.1f}"
        cv2.putText(frame, text, (10, 30),
                    cv2.FONT_HERSHEY_SIMPLEX, 0.7, (0, 255, 0), 2)

        # When dark, start beep
        if brightness < BRIGHTNESS_LIMIT and not beeping:
            stop_event = threading.Event()
            beep_thread = threading.Thread(target=beep_loop, args=(stop_event,), daemon=True)
            beep_thread.start()
            beeping = True
            print("Room dark → Beep ON")

        # When light, stop beep
        elif brightness >= BRIGHTNESS_LIMIT and beeping:
            stop_event.set()
            beeping = False
            print("Room light → Beep OFF")

        cv2.imshow("Light Detector (Press q to quit)", frame)
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

    # Cleanup
    cap.release()
    cv2.destroyAllWindows()
    if beeping and stop_event:
        stop_event.set()

if _name_ == "_main_":
    main()