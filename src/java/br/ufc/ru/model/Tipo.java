package br.ufc.ru.model;
public class Tipo {
    private String nome;
    private double valorRefeicao;
    
    
    //Fazer verificações nos metodos setter
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getValorRefeicao(){
        return valorRefeicao;
    }
    
    public void setValorRefeicao(double valorRefeicao){
        this.valorRefeicao = valorRefeicao;
    }
}
