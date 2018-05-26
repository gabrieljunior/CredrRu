package br.ufc.ru.model;

import br.ufc.ru.dao.UsuarioDAO;
import java.io.Serializable;

public class Usuario{
    private String nome;
    private int codigo;
    private String senha;
    private Tipo tipo;
    private String curso;
    private Credito credito;
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
    
    public Credito getCredito(){
        return credito;
    }
    
    public void setCredito(Credito credito){
        this.credito = credito;
    }
    
    public String status() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public boolean autenticar(String login, String senha){
        /*for(int i = 0; i < UsuarioDAO.getUsers().size(); i++){
            if(UsuarioDAO.getUsers().get(i).getCodigo() == Integer.parseInt(login) && UsuarioDAO.getUsers().get(i).getSenha().equals(senha)){
                return true;
            }
        }*/
        return false;
    }
}
