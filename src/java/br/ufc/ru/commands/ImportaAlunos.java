package br.ufc.ru.commands;
import br.ufc.ru.model.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ImportaAlunos implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        Usuario usuario = new Usuario();
        try {
            if(usuario.importarAlunos(request)){
                try {
                    RequestDispatcher rd = request.getRequestDispatcher("/sucesso.jsp");
                    rd.forward(request, response);
                } catch (ServletException ex) {
                    Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                    rd.forward(request, response);
                } catch (ServletException ex) {
                    Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
