// script.js
function updateAvatarText() {
    const inputText = document.getElementById('textInput').value;
    const avatarText = document.getElementById('avatarText');
    
    if (inputText.trim() === "") {
        avatarText.textContent = "Hello! Type something...";
    } else {
        avatarText.textContent = inputText;
    }
}
