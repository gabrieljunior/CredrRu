package br.ufc.ru.commands;

import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.ru.model.Erro;
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
        String matricula = request.getParameter("matricula");
        String senha = request.getParameter("senha");
        
        //Fazer as partes de erro depois
        
        Erro erros = new Erro();
        
        if(matricula != null && matricula.isEmpty() != true){
            if(senha != null && senha.isEmpty() != true){
                if(UsuarioDAO2.getUsuario(Integer.parseInt(matricula)) != null){
                    if(UsuarioDAO2.getUsuario(Integer.parseInt(matricula)).getSenha().equals(senha)){
                        Usuario usuario = UsuarioDAO2.getUsuario(Integer.parseInt(matricula));
                        request.setAttribute("usuario", usuario);
                        
                        RequestDispatcher rd = request.getRequestDispatcher("principal.jsp");
                        try {
                            rd.forward(request, response);
                        } catch (ServletException ex) {
                            Logger.getLogger(Autentica.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(Autentica.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        erros.add("Senha incorreta!");
                    }
                }else{
                    erros.add("Usuario não cadastrado!!");
                }
            }else{
                erros.add("Senha não informada!");
            }
        }else{
            erros.add("Matricula não informada!");
        }
        
        request.getSession().invalidate();
        request.setAttribute("mensagens", erros);
          
        String URL = "/login.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        try {
            rd.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(Autentica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Autentica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
