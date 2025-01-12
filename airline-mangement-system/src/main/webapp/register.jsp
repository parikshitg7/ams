<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Register</h2>
    <form action="register" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" required><br>

        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br>

        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required><br>

        <button type="submit">Register</button>
    </form>
    <p><a href="login.jsp">Already have an account? Login</a></p>
</body>
</html>
