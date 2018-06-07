package br.ufc.ru.model;
import br.ufc.ru.commands.ImportaAlunos;
import br.ufc.ru.dao.TipoDAO;
import br.ufc.ru.dao.UsuarioDAO;
import br.ufc.ru.dao.UsuarioDAO2;
import br.ufc.ru.dao.UsuarioDAOImpl;
import br.ufc.util.Erro;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Usuario implements Serializable{
    private String nome;
    private int codigo;
    private String senha;
    private Tipo tipo;
    private String curso;
    private double saldo;
    private String status;
    
    //Fazer verificações nos metodos setter
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public Tipo getTipo(){
        return tipo;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public boolean autenticar(HttpServletRequest request){
        Erro erros = new Erro();
        String codigo = request.getParameter("codigo");
        String senha = request.getParameter("senha");
        if(codigo != null && codigo.isEmpty() != true){
            if(senha != null && senha.isEmpty() != true){
                UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
                Usuario usuario = usuarioDAO.getUsuario(Integer.parseInt(codigo));
                if(usuario != null){
                    if(usuario.getSenha().equals(senha)){
                        
                        Tipo tipo = usuario.getTipo();
                        HttpSession sessao = request.getSession();
                        sessao.setAttribute("tipo", tipo);
                        sessao.setAttribute("usuario", usuario);
                        
                        return true;
                    }else{
                        erros.add("Senha incorreta!");
                    }
                }else{
                    erros.add("Usuario não cadastrado!");
                }
            }else{
                erros.add("Senha não informada!");
            }
        }else{
            erros.add("Código não informado!");
        }
        
        request.getSession().invalidate();
        
        request.setAttribute("mensagens", erros);
        
        return false;  
        }
    
    public boolean adicionaUsuario(String codigo, String nome, String curso, String senha, String status){
        if(codigo != null && codigo.isEmpty() != true){
            if(nome != null && nome.isEmpty() != true){
                UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
                Usuario usuario = usuarioDAO.getUsuario(Integer.parseInt(codigo));
                
                if( usuario == null ){
                    Usuario user = new Usuario();
                    user.setCodigo(Integer.parseInt(codigo));
                    user.setNome(nome);
                    user.setCurso(curso);
                    user.setTipo(TipoDAO.get("Aluno"));
                    user.setStatus(status);
                    user.setSenha(senha);
                    
                    usuarioDAO.adicionarUsuario(user);
                    
                    return true;
                }
            }                     
        }
        return false;
    }
    
    /*Esse método só funciona se o arquivo estiver no diretório "D:\\", 
      caso contrário será gerado uma
      exceção, pois não vai encontar o arquivo.
      Vamos torcer que ele não peça para abrir um arquivo que esteja em outro diretório.
    */
    public boolean importarAlunos(HttpServletRequest request) throws FileNotFoundException, IOException{
        String path = request.getParameter("file");
        
        BufferedReader buffRead = new BufferedReader(new FileReader("D:/"+path));
        String linha = "";
        
        linha = buffRead.readLine();
        
        while (true) {
            if (linha != null) {
                String matricula = linha.substring(0,6);
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
                
                UsuarioDAO usuarioDao = new UsuarioDAOImpl();
                usuarioDao.adicionarUsuario(user);
            } else
                break;
            linha = buffRead.readLine();
                
            }
        buffRead.close();
        return true;
    }
    
    public boolean realizarRecarga(String codigo, double valor){
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        Usuario usuario = usuarioDAO.getUsuario(Integer.parseInt(codigo));
        
            usuarioDAO.getUsuario(Integer.parseInt(codigo)).setSaldo(usuario.getSaldo()+valor);
            
            String descricao = "RECARGA";
            Movimento movimento = new Movimento();
            movimento.registrar(Integer.parseInt(codigo), descricao, valor);
            return true;
    }
    
    public boolean debitar(){
        return false;
    }
}
