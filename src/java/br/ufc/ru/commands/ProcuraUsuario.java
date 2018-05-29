package br.ufc.ru.commands;

import br.ufc.ru.dao.UsuarioDAO2;
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
        String matricula = request.getParameter("matricula");
        if(matricula != null && matricula.isEmpty() != true){
            if(UsuarioDAO2.getUsuario(Integer.parseInt(matricula)) != null){
                Usuario usuario = UsuarioDAO2.getUsuario(Integer.parseInt(matricula));
                Credito credito = new Credito();
                double almoco = 5 * usuario.getTipo().getValorRefeicao();
                double almocoJanta = 10 * usuario.getTipo().getValorRefeicao();
                
                        
                Locale ptBr = new Locale("pt", "BR");
                credito.setAlmoco(NumberFormat.getCurrencyInstance(ptBr).format(almoco));
                credito.setAlmocoJanta(NumberFormat.getCurrencyInstance(ptBr).format(almocoJanta));
                String valor = NumberFormat.getCurrencyInstance(ptBr).format(usuario.getTipo().getValorRefeicao());
                
                request.setAttribute("credito", credito);
                request.setAttribute("valorRefeicao", valor);
                request.setAttribute("usuario", usuario);
            }
        }
        RequestDispatcher rd;
        if(request.getParameter("acao").equals("recarga")){
            rd = request.getRequestDispatcher("/recarga.jsp");
        }else{
            rd = request.getRequestDispatcher("/debitar.jsp");
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
