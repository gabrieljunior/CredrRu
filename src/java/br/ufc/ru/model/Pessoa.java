package br.ufc.ru.model;

public class Pessoa {
    private String nome;
    private int codigo;
    private String senha;
    private Tipo tipo;
    private Credito credito;
    
    //Fazer verificações nos metodos setter
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int codigo(){
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
    
    public Credito getCredito(){
        return credito;
    }
    
    public void setCredito(Credito credito){
        this.credito = credito;
    }
}
