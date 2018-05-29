package br.ufc.ru.model;

import java.io.Serializable;

public class Credito implements Serializable {
    private String almoco;
    private String almocoJanta;

    public String getAlmoco() {
        return almoco;
    }

    public void setAlmoco(String almoco) {
        this.almoco = almoco;
    }

    public String getAlmocoJanta() {
        return almocoJanta;
    }

    public void setAlmocoJanta(String almocoJanta) {
        this.almocoJanta = almocoJanta;
    }
    
    
}


