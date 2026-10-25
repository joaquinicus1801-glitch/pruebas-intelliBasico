<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Mi primera web</title>
</head>
<body>

    <h1>¡Hola desde Tomcat 11!</h1>
    <p>Mi primera aplicación web con Maven e IntelliJ.</p>
    <p>cambio a ver si cambia xd</p>

    <p>aplicando el mvc</p>
        <p>${mensaje}  </p>
    <p>mostrara esto en el con response?</p>
<p>${mensaje1}</p>

    <a href="http://localhost:8080/MiPrimerWeb/saludo">asdasdasdasasd</a>
    <p>uzumaki naruto te hace rasengan</p>

<p>esto es de prueba de ruqest y response</p>
    <p>Request: ${requestScope.nombre}</p>

    <p>Session: ${sessionScope.nombre}</p>w

    <p>Sin scope: ${nombre}</p>

</body>
</html>