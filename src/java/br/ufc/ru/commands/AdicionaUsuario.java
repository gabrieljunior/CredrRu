package br.ufc.ru.commands;

import br.ufc.ru.model.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionaUsuario implements Command{
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String codigo = request.getParameter("codigo");
        String nome = request.getParameter("nome");
        String curso = request.getParameter("curso");
        String senha = request.getParameter("senha");
        String status = request.getParameter("status");
        Usuario usuario = new Usuario();
        if(usuario.adicionaUsuario(codigo, nome, curso, senha, status) == true){
            try {
                String url = "/sucesso.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        }else{
            try {
                String url = "/erro.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request, response);
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        }
    }
}
