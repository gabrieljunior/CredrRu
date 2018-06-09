package br.ufc.ru.commands;

import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.util.Erro;
import br.ufc.ru.model.Tipo;
import br.ufc.ru.model.Usuario;
import br.ufc.ru.model.UsuarioBean;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Autentica implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        
        Usuario usuario = new Usuario();
        
        if(usuario.autenticar(request) == true){
            RequestDispatcher rd = request.getRequestDispatcher("/principal.jsp");
            try {
                rd.forward(request, response);
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            try {
                rd.forward(request, response);
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        }
    }
    
}
