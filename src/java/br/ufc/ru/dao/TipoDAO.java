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
                Tipo e1 = new Tipo();
                e1.setNome("Aluno");
                e1.setValorRefeicao(1.10);
                tipos.add(0, e1);
                return tipos.get(0);
            case "Aluno Beneficiario":
                Tipo e2 = new Tipo();
                e2.setNome("Aluno Beneficiario");
                e2.setValorRefeicao(0.00);
                tipos.add(1, e2);
                return tipos.get(1);
            case "Servidor":
                Tipo e3 = new Tipo();
                e3.setNome("Servidor");
                e3.setValorRefeicao(1.60);
                tipos.add(2, e3);
                return tipos.get(2);
            case "Docente":
                Tipo e4 = new Tipo();
                e4.setNome("Docente");
                e4.setValorRefeicao(2.20);
                tipos.add(3, e4);
                return tipos.get(3);
            
       }
        return null;
    }
}
