package br.ufc.ru.commands;
import br.ufc.ru.model.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizaRecarga implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String valorString = request.getParameter("opcao");
        valorString = valorString.substring(2, valorString.length()).replace(",", ".");
        
        double valor = Double.parseDouble(valorString);
        String codigo = request.getParameter("codigo");
        
        Usuario usuario = new Usuario();
        
        if(usuario.realizarRecarga(codigo, valor)){
            String acao = "Recarga";
            String url = "/Pagina?page=ExibeSucesso&acao="+acao;
            RequestDispatcher rd = request.getRequestDispatcher(url);
            try {
                rd.forward(request, response);
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        }
    }
}
