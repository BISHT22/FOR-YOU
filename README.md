<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Avatar Text Display</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="avatar-container">
        <div class="avatar">
            <div class="avatar-face">
                <!-- Avatar face elements can be added here -->
            </div>
            <div class="avatar-text" id="avatarText">Hello! Type something...</div>
        </div>
    </div>
    <div class="input-container">
        <input type="text" id="textInput" placeholder="Type something...">
        <button onclick="updateAvatarText()">Speak</button>
    </div>

    <script src="script.js"></script>
</body>
</html>
