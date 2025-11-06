import cv2
import numpy as np
import screen_brightness_control as sbc
import cv2
import time

# Brightness settings
BRIGHT_WHITE_BRIGHTNESS = 100  # Max brightness
NORMAL_BRIGHTNESS = 50         # Normal brightness

# Darkness threshold (lower = more sensitive)
THRESHOLD = 40

# Start webcam
cap = cv2.VideoCapture(0)

white_window_open = False

def show_white_screen():
    global white_window_open
    if not white_window_open:
        white = np.ones((480, 640, 3), dtype='uint8') * 255
        cv2.namedWindow("WHITE SCREEN", cv2.WND_PROP_FULLSCREEN)
        cv2.setWindowProperty("WHITE SCREEN", cv2.WND_PROP_FULLSCREEN, cv2.WINDOW_FULLSCREEN)
        cv2.imshow("WHITE SCREEN", white)
        white_window_open = True

def close_white_screen():
    global white_window_open
    if white_window_open:
        cv2.destroyWindow("WHITE SCREEN")
        white_window_open = False

while True:
    ret, frame = cap.read()
    if not ret:
        print("Camera not found.")
        break

    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    brightness = gray.mean()

    print("Room Brightness:", int(brightness))

    if brightness < THRESHOLD:  # Dark or camera covered
        sbc.set_brightness(BRIGHT_WHITE_BRIGHTNESS)
        show_white_screen()
        print("→ DARK detected: Screen = WHITE HIGH BRIGHT")
    else:
        sbc.set_brightness(NORMAL_BRIGHTNESS)
        close_white_screen()
        print("→ LIGHT detected: Screen back to normal")

    # Press Q to exit
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

    time.sleep(0.5)

cap.release()
close_white_screen()
cv2.destroyAllWindows()
