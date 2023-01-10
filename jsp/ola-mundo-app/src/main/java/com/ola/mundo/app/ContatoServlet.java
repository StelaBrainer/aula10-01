package com.ola.mundo.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContatoServlet extends HttpServlet { /* esse Servlet mapeia a rota contatos a uma página jsp */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {/* faz o request ao banco e a resposta ao cliente */
        RequestDispatcher rd = request.getRequestDispatcher("exibe-contatos.jsp");
        rd.forward(request, response);

    }
}
