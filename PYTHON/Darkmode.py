import cv2
import screen_brightness_control as sbc
import time

# Brightness levels (adjust as you want)
BRIGHT_MODE = 100   # Bright when room dark
NORMAL_MODE = 50    # Normal brightness

# Darkness threshold
THRESHOLD = 50   # Lower = darker detection is more sensitive

# Start camera
cap = cv2.VideoCapture(0)

if not cap.isOpened():
    print("Camera not detected!")
    exit()

while True:
    ret, frame = cap.read()
    if not ret:
        break
    
    # Convert to grayscale to analyze brightness
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    
    # Measure average brightness
    brightness = gray.mean()
    print("Room Brightness:", int(brightness))

    # Check brightness and adjust screen
    if brightness < THRESHOLD:
        sbc.set_brightness(BRIGHT_MODE)
        print("Room is dark → Screen brightness set HIGH.")
    else:
        sbc.set_brightness(NORMAL_MODE)
        print("Room is bright → Screen brightness set NORMAL.")
    
    # Show camera feed (optional)
    cv2.imshow("Camera Brightness Monitor", frame)

    # Exit when pressing 'q'
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

    time.sleep(1)

cap.release()
cv2.destroyAllWindows()
