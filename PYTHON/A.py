import cv2
from cvzone.HandTrackingModule import HandDetector
import numpy as np
import sounddevice as sd
import time

# Initialize webcam
cap = cv2.VideoCapture(0)

# Initialize hand detector
detector = HandDetector(detectionCon=0.8, maxHands=2)

# Function to create and play beep sound
def beep(frequency=1000, duration=0.2):
    sample_rate = 44100
    t = np.linspace(0, duration, int(sample_rate * duration), False)
    tone = np.sin(frequency * 2 * np.pi * t)
    sd.play(tone, sample_rate)
    sd.wait()

last_beep_time = 0
cooldown = 2  # seconds between beeps

while True:
    success, img = cap.read()
    if not success:
        break

    hands, img = detector.findHands(img)

    if hands:
        current_time = time.time()
        if current_time - last_beep_time > cooldown:
            print("👋 Hand detected! Beep sound playing...")
            beep()
            last_beep_time = current_time

    cv2.imshow("Hand Detection", img)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()
