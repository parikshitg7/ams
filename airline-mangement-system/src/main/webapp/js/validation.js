document.getElementById('registerForm').addEventListener('submit', function (event) {
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (!name || !email || !password) {
        alert('All fields are required!');
        event.preventDefault();
    } else if (password.length < 6) {
        alert('Password must be at least 6 characters!');
        event.preventDefault();
    }
});

document.getElementById('loginForm').addEventListener('submit', function (event) {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (!email || !password) {
        alert('Both email and password are required!');
        event.preventDefault();
    }
});
