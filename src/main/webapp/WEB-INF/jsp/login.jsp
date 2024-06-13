<%-- 
    Document   : index
    Created on : Jun 12, 2024, 1:14:07 PM
    Author     : onairo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Autoservicio Popular</title>
    <link rel="stylesheet" href="./css/login.css">
    <link rel="stylesheet" href="./css/fonts.css">
    <link rel="shortcut icon" href="./assets/favicon.ico" type="image/x-icon">
</head>
<body>
    <section id="left" class="section"> 
        <img src="./assets/image/logo.webp" alt="Logo Autoservicio Popular">
        <p>Autoservicio Popular, "Calidad y economía a su alcance"</p>
    </section>
    <section id="right" class="section"> 
        <img src="./assets/image/user.webp" alt="">
        <form id="container" action="/WebServer/login" method="POST">
            <input name="email" type="email" placeholder="Correo Electrónico" required>
            <input name="password" type="password" placeholder="Contraseña" required>
            <button type="submit">Ingresar</button>
            <a href="">Olvidé mi contraseña</a>
            <a href="./registro">Registrarce</a>
        </form>
    </section>
    <script src="./javascript/auth.js"></script>
</body>
</html>

