package org.example;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/saludo") //Define la ruta que atenderá el Servlet.
public class SaludoServlet extends HttpServlet { //estra clase hereda la clase servlet

    @Override //sobrescribe el metodo padre que porcesa peticiones Get
    protected void doGet( //se usa para consultar informacion
            HttpServletRequest request, // Representa la petición recibida. (parametros del doget)
            HttpServletResponse response //Permite construir la respuesta HTTP.
    ) throws IOException, ServletException {
     /*
       Esto funciona, pero imagina tener una página con cientos de líneas HTML.
        No sería cómodo escribirlas dentro de una clase Java.

        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().println(
                "<h1>¡Hola desde mi primer Servlet!</h1>"
        ); //Permite escribir texto en la respuesta.
        */
        /*
        String mensaje = "¡Hola desde mi Servlet!";

        request.setAttribute("mensaje", mensaje);

        request.getRequestDispatcher("/index.jsp").forward(request, response);

        request.setAttribute("mensaje1", "Hola desde request");

        response.sendRedirect("index.jsp");
          */

        //prueba de requestt y sesion en jsp EL

        request.setAttribute("nombre", "Ana");

        HttpSession session = request.getSession();
        session.setAttribute("nombre", "Carlos");

        request.getRequestDispatcher("/index.jsp")
                .forward(request, response);

    }
}
