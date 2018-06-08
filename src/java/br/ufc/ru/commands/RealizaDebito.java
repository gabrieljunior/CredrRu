package br.ufc.ru.commands;

import br.ufc.ru.dao.UsuarioDAO;
import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.ru.dao.UsuarioDAOImpl;
import br.ufc.ru.model.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizaDebito implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        Usuario usuario = usuarioDAO.getUsuario(Integer.parseInt(request.getParameter("codigo")));
        String valor = request.getParameter("valor");
        
        if(usuario.realizarDebito(request)){
            RequestDispatcher rd = request.getRequestDispatcher("/sucesso.jsp?acao=Debito&valor="+valor);
            try {
                rd.forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(RealizaDebito.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RealizaDebito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
