from PIL import Image, ImageDraw, ImageFont

# Create a blank image (width, height) with background color
img = Image.new("RGB", (800, 500), color=(20, 20, 60))

# Create a drawing object
draw = ImageDraw.Draw(img)

# Add a title
draw.text((200, 50), "MY PYTHON DESIGN", fill="white", font=ImageFont.truetype("arial.ttf", 40))

# Add a slogan
draw.text((250, 120), "Code. Create. Design.", fill="cyan", font=ImageFont.truetype("arial.ttf", 30))

# Draw a rectangle box
draw.rectangle([(100, 200), (700, 400)], outline="yellow", width=5)

# Add some text inside box
draw.text((230, 260), "Powered by Python 🐍", fill="orange", font=ImageFont.truetype("arial.ttf", 35))

# Save your design
img.save("poster_design.png")

print("✅ Poster created successfully! Check your folder for 'poster_design.png'")