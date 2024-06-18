<%-- 
    Document   : products
    Created on : Jun 18, 2024, 9:48:43 AM
    Author     : onairo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="com.popular.server.models.Product"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Autoservicio Popular | Calidad y servicio</title>
    <link rel="stylesheet" href="./css/fooder.css">
    <link rel="stylesheet" href="./css/topBar.css">
    <link rel="stylesheet" href="./css/productos.css">
    <link rel="shortcut icon" href="./assets/favicon.ico" type="image/x-icon">
</head>
<body>
    <main>
        <jsp:include page="./jsp-modules/topbar.jsp"/>
        <section class="flexCenter">
            <h1>Detalles del producto</h1>
            <div id="container" class="flexCenter">
                <img src="${product.getImg()}" alt="${product.getName()}" id="imgProducto">
                <div class="flexCenter">
                    <h3>${product.getName()}</h3>
                    <span>Precio: ${product.localPrice()}</span>
                    <p>
                        Detalles: <br>
                        ${product.getDescription()}
                    </p>
                    <label for="inputNum">
                        <span>Cantidad</span>
                        <input type="number" name="" id="inputNum" value="1">
                    </label>
                    
                    <button>Agregar al carrito</button>
                </div>
            </div>
        </section>
    </main>
    <jsp:include page="./jsp-modules/fooder.jsp"/>
</body>
</html>