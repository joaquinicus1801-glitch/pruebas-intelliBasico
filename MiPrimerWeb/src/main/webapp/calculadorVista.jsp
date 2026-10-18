<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Calculadora MVC</title>
</head>
<body>

<h1>Calculadora Web</h1>

<form action="calcular" method="post">

    <label>Primer número:</label>
    <input type="number" name="numero1" required>

    <label>Segundo número:</label>
    <input type="number" name="numero2" required>

    <button type="submit">Sumar</button>
</form>

</body>
</html>