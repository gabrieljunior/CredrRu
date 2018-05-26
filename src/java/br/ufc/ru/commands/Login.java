package br.ufc.ru.commands;

import br.ufc.ru.dao.UsuarioDAO;
import java.io.IOException;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login implements Command{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            RequestDispatcher d = request.getRequestDispatcher("/login.jsp");
            d.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
        
        /*if(request.getParameter("matricula") != null && request.getParameter("matricula").isEmpty() != true){
            if(request.getParameter("senha") != null && request.getParameter("senha").isEmpty() != true){
                for(int i = 0; i < UsuarioDAO.getUsers().size(); i++){
                    out.print(UsuarioDAO.getUsers().get(i).getCodigo());
                    if(UsuarioDAO.getUsers().get(i).getCodigo() == Integer.parseInt(request.getParameter("matricula")) && UsuarioDAO.getUsers().get(i).getSenha().equals(request.getParameter("senha"))){
                        RequestDispatcher rd = request.getRequestDispatcher("historico.jsp");
                        try {
                            rd.forward(request, response);
                        } catch (ServletException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }*/
    }
}
