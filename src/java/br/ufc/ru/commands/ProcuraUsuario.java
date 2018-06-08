package br.ufc.ru.commands;

import br.ufc.ru.dao.UsuarioDAO;
import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.ru.dao.UsuarioDAOImpl;
import br.ufc.ru.model.Credito;
import br.ufc.ru.model.Usuario;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcuraUsuario implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        Usuario usuario = new Usuario();
        RequestDispatcher rd;
        
        if(usuario.procuraUsuario(request)){
            if(request.getParameter("acao").equals("recarga")){
                rd = request.getRequestDispatcher("/recarga.jsp");
            }else{
                rd = request.getRequestDispatcher("/debitar.jsp");
            }
            
            
        }else{
            rd = request.getRequestDispatcher("/index.jsp");
        }
        try {
                rd.forward(request, response);
            } catch (ServletException ex) {
                Logger.getLogger(ProcuraUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProcuraUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
