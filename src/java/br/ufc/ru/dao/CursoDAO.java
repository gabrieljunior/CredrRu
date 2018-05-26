package br.ufc.ru.dao;

import java.util.ArrayList;

public class CursoDAO {
    private static ArrayList<String> cursos = new ArrayList<String>();

    public static ArrayList<String> getCursos() {
        return cursos;
    }

    public static void setCursos(ArrayList<String> cursos) {
        CursoDAO.cursos = cursos;
    }
    
    public static void gravar(String c){
        cursos.add(c);
    }
}
