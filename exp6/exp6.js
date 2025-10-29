function validateEmail() {
    const emailInput = document.getElementById('email');
    const resultDiv = document.getElementById('result');
    const email = emailInput.value.trim();
    
    if (email === '') {
        resultDiv.className = 'message error';
        resultDiv.textContent = 'Please enter an email address';
        alert('Please enter an email address');
        return;
    }
    
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    
    if (emailRegex.test(email)) {
        resultDiv.className = 'message success';
        resultDiv.textContent = '✓ Valid email address!';
        alert('✓ Valid email address!');
    } else {
        resultDiv.className = 'message error';
        resultDiv.textContent = '✗ Invalid email address';
        alert('✗ Invalid email address');
    }
}

document.getElementById('email').addEventListener('keypress', function(e) {
    if (e.key === 'Enter') {
        validateEmail();
    }
});