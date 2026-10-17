package org.example;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/saludo") //Define la ruta que atenderá el Servlet.
public class SaludoServlet extends HttpServlet { //estra clase hereda la clase servlet

    @Override //sobrescribe el metodo padre que porcesa peticiones Get
    protected void doGet( //se usa para consultar informacion
            HttpServletRequest request, // Representa la petición recibida. (parametros del doget)
            HttpServletResponse response //Permite construir la respuesta HTTP.
    ) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
                "<h1>¡Hola desde mi primer Servlet!</h1>"
        ); //Permite escribir texto en la respuesta.
    }
}
