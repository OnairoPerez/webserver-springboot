<%-- 
    Document   : searchEngine
    Created on : Jun 14, 2024, 2:59:44 PM
    Author     : onairo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="com.popular.server.models.Product"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Autoservicio Popular</title>
    <link rel="stylesheet" href="./css/buscador.css">
    <link rel="stylesheet" href="./css/topBar.css">
    <link rel="stylesheet" href="./css/fonts.css">
    <link rel="shortcut icon" href="./assets/favicon.ico" type="image/x-icon">
</head>
<body>
    <jsp:include page="./jsp-modules/topbar.jsp"/>
    <section id="Container">
        <div id="LeftBar">
            <div id="Marca" class="Options">
                <h4>Marca</h4>
                <hr>
                <%
                    Set<String> brands = (Set<String>) request.getAttribute("brands");
                    for (String brand : brands) {
                        out.println("<button>" + brand + "</button>");
                    }
                %>
            </div>
            <div id="Ordenar" class="Options">
                <h4>Ordenar</h4>
                <hr>
                <% 
                    String[] order = {"Precio ▲️", "Precio ▼", "Más comprado"};
                    for (String item : order) {
                        out.println("<button>" + item + "</button>");
                    }
                %>
            </div>
            <div class="space"></div>
        </div>
        <div id="Contenido">
            <div id="Productos">
                <%
                    List<Product> products = (List<Product>) request.getAttribute("products");
                    for (Product product : products) {
                        out.println("<div class=\"ProdList\">");
                        out.println("<div><img src=" + product.getImg() + "></div>");
                        out.println("<div class=\"TextList\">");
                        out.println("<a href=\"/product?id=" + product.getCode() + "\">" + product.getName()+ "</a>");
                        out.println("<p>" + product.localPrice() + "</p>");
                        out.println("</div>");
                        out.println("</div>");
                    }
                %>
            </div>
            <div id="indice">
                <button class="buttonInd">◀</button>
                <button class="buttonInd">1</button>
                <button class="buttonInd">▶</button>
            </div>
        </div>
    </section>
    <script src="./javascript/topBar.js"></script>
</body>
<html/>
