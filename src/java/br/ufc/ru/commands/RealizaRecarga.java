package br.ufc.ru.commands;

import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.ru.model.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizaRecarga implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String valor = request.getParameter("opcao");
        valor = valor.substring(2, valor.length()).replace(",", ".");
        UsuarioDAO2.getUsuario(379059).setSaldo(Double.parseDouble(valor));
        
        String acao = "Recarga";
        
        String url = "/Controller?command=ExibeSucesso&acao="+acao;
        
        RequestDispatcher rd = request.getRequestDispatcher(url);
        try {
            rd.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(RealizaRecarga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RealizaRecarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
