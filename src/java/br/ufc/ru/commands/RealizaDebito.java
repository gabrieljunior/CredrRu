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

public class RealizaDebito implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        Usuario usuario = UsuarioDAO2.getUsuario(Integer.parseInt(request.getParameter("codigo")));
        
        //Criar outra condição para verificar se o usuario fez uma refeição no mesmo periodo de tempo
        if(usuario.getSaldo() >= usuario.getTipo().getValorRefeicao()){
            double saldoAtual = usuario.getSaldo();
            UsuarioDAO2.getUsuario(Integer.parseInt(request.getParameter("codigo"))).setSaldo(saldoAtual-usuario.getTipo().getValorRefeicao());
            double valor = UsuarioDAO2.getUsuario(Integer.parseInt(request.getParameter("codigo"))).getSaldo();
            
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
