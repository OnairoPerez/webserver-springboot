<%-- 
    Document   : register
    Created on : Jun 13, 2024, 2:50:54 PM
    Author     : onairo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Autoservicio Popular</title>
    <link rel="stylesheet" href="./css/registro.css">
    <link rel="shortcut icon" href="./assets/favicon.ico" type="image/x-icon">
</head>
<body>
    <section id="left" class="section"> 
        <img src="./assets/image/logo.webp" alt="Logo Autoservicio Popular">
        <p>Autoservicio Popular, "Calidad y economía a su alcance"</p>
    </section>
    <section id="right" class="section"> 
        <form id="formulario" action="" method="POST">
            <h2>Registrar</h2>
            <fieldset class="sectionform info">
                <legend>Datos personales</legend>
                <input type="text" name="name" form="formulario" autocomplete="off" placeholder="Nombres">
                <input type="text" name="surname" form="formulario" autocomplete="off" placeholder="Apellidos">
                <input type="number" name="personID" form="formulario" autocomplete="off" placeholder="Número de identificación">
            </fieldset>
            <fieldset id="fieldset2" class="sectionform info">
                <legend>Datos de contacto</legend>
                <input type="text" name="address" autocomplete="off" placeholder="Dirección de recidencia">
                <div class="">
                    <input type="tel" name="phone" form="formulario" autocomplete="off" placeholder="Celular">
                    <input type="text" name="city" form="formulario" autocomplete="off" placeholder="Ciudad">
                </div>
            </fieldset>
            <button class="info display" type="button">Siguiente</button>
            <button id="return" class="account display" type="button" style="display: none;">
                <svg  xmlns="http://www.w3.org/2000/svg"  width="30"  height="30"  viewBox="0 0 24 24"  fill="none"  stroke="currentColor"  stroke-width="2"  stroke-linecap="round"  stroke-linejoin="round"  class="icon icon-tabler icons-tabler-outline icon-tabler-arrow-back-up"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M9 14l-4 -4l4 -4" /><path d="M5 10h11a4 4 0 1 1 0 8h-1" /></svg>
            </button>
            <fieldset class="sectionform account" style="display: none;">
                <legend>Crear cuenta</legend>
                <input type="email" name="email" form="formulario" autocomplete="off" placeholder="Correo Elctrónico" style="margin-bottom: 15px;">
                <div id="password">
                    <input type="password" name="password" form="formulario" autocomplete="off" placeholder="Contraseña">
                    <button id="eye" type="button">
                        <svg  xmlns="http://www.w3.org/2000/svg"  width="24"  height="24"  viewBox="0 0 24 24"  fill="none"  stroke="currentColor"  stroke-width="2"  stroke-linecap="round"  stroke-linejoin="round"  class="icon icon-tabler icons-tabler-outline icon-tabler-eye"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M10 12a2 2 0 1 0 4 0a2 2 0 0 0 -4 0" /><path d="M21 12c-2.4 4 -5.4 6 -9 6c-3.6 0 -6.6 -2 -9 -6c2.4 -4 5.4 -6 9 -6c3.6 0 6.6 2 9 6" /></svg>
                    </button>
                </div>
                <input type="password" autocomplete="off" placeholder="Confirmar contraseña">
            </fieldset>
            <button class="account" type="submit" style="display: none;">Registrarce</button>
        </form>
    </section>
    <script src="./javascript/registro.js"></script>
    <<script src="./javascript/reg.js"></script>
</body>
</html>