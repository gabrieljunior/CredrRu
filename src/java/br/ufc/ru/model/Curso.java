package br.ufc.ru.model;

import java.io.Serializable;

public class Curso implements Serializable{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
