/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufc.ru.dao;

import br.ufc.ru.model.Tipo;
import java.util.ArrayList;

public class TipoDAO {
    private static ArrayList<Tipo> tipos = new ArrayList<Tipo>();
    
    public static ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public static void setTipos(ArrayList<Tipo> tipos) {
        TipoDAO.tipos = tipos;
    }
    
    public static void gravar(Tipo t){
        tipos.add(t);
    }
    
    public static Tipo get(String s){
        switch(s){
            case "Aluno":
                Tipo e = new Tipo();
                e.setNome("Aluno");
                e.setValorRefeicao(1.10);
                tipos.add(e);
                return tipos.get(0);
        }
        return null;
    }
}
