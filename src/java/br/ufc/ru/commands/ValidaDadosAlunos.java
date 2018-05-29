package br.ufc.ru.commands;

import br.ufc.ru.dao.TipoDAO;
import br.ufc.ru.dao.UsuarioDAO;
import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.ru.dao.UsuarioDAOImpl;
import br.ufc.ru.model.Usuario;
import br.ufc.ru.model.UsuarioBean;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidaDadosAlunos implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String codigo = request.getParameter("codigo");
        String nome = request.getParameter("nome");
        String curso = request.getParameter("curso");
        String senha = request.getParameter("senha");
        String status = request.getParameter("status");
        
        if(codigo != null && codigo.isEmpty() != true){
            if(nome != null && nome.isEmpty() != true){
                if(UsuarioDAO2.getUsuario(Integer.parseInt(codigo)) == null){
                    Usuario user = new Usuario();
                    user.setCodigo(Integer.parseInt(codigo));
                    user.setNome(nome);
                    user.setCurso(curso);
                    user.setTipo(TipoDAO.get("Aluno"));
                    user.setStatus(status);
                    user.setSenha(senha);
                    
                    UsuarioDAO2.users.add(user);
                    
                    String acao = "Cadastro";
                    
                    try {
                        String url = "/Controller?command=ExibeSucesso&acao="+acao;
                        RequestDispatcher d = request.getRequestDispatcher(url);
                        d.forward(request, response);
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        RequestDispatcher d = request.getRequestDispatcher("/erro.jsp");
                        d.forward(request, response);
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
