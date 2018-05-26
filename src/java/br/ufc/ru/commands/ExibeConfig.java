package br.ufc.ru.commands;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExibeConfig implements Command{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher d = request.getRequestDispatcher("/config.jsp");
            d.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
}
