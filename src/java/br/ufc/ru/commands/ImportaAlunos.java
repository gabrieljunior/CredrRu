package br.ufc.ru.commands;

import br.ufc.ru.dao.TipoDAO;
import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.ru.model.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.*;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

public class ImportaAlunos implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        String path = request.getParameter("file");
        out.print(path);
        
        BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(new FileReader("D:/alunos.jsp"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String linha = "";
        try {
            linha = buffRead.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (true) {
            if (linha != null) {
                String matricula = linha.substring(0,6);
                if(UsuarioDAO2.getUsuario(Integer.parseInt(matricula)) == null){
                    String nome = linha.substring(7,linha.length());
                    String curso = request.getParameter("curso");
                    String status = "ativo";
                    String senha = "ufcrussas";
                    Usuario user = new Usuario();
                    user.setCodigo(Integer.parseInt(matricula));
                    user.setNome(nome);
                    user.setCurso(curso);
                    user.setTipo(TipoDAO.get("Aluno"));
                    user.setStatus(status);
                    user.setSenha(senha);
                    
                    UsuarioDAO2.users.add(user);
                }
            } else
                break;
            try {
                linha = buffRead.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            buffRead.close();
        } catch (IOException ex) {
            Logger.getLogger(ImportaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            RequestDispatcher d = request.getRequestDispatcher("/teste.jsp");
            d.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }
}
