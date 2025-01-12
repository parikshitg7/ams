<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Login</h2>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" required><br>

        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required><br>

        <button type="submit">Login</button>
    </form>
    <p><a href="register.jsp">Don't have an account? Register</a></p>
</body>
</html>
