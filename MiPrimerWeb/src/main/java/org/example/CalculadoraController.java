package org.example;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.CalculadorModel;

import java.io.IOException;
@WebServlet("/calcular")
public class CalculadoraController extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
       int num1 = Integer.parseInt(request.getParameter("numero1"));
        int num2 = Integer.parseInt(request.getParameter("numero2"));
        CalculadorModel suma = new CalculadorModel(num1,num2);
        request.setAttribute("resultado", suma.sumar());
        request.getRequestDispatcher("/resultado.jsp").forward(request, response);

    }



}
