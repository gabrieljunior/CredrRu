package br.ufc.ru.dao;

import java.util.ArrayList;

public class CursoDAO {
    private static ArrayList<String> cursos = new ArrayList<String>();
    private static int contador;
    
    public static ArrayList<String> getCursos() {
        return cursos;
    }

    public static void setCursos(ArrayList<String> cursos) {
        CursoDAO.cursos = cursos;
    }
    
    public static void gravar(String c){
        cursos.add(c);
    }
    
    public static void init(){
        if(contador == 0){
            cursos.add("Ciência da Computação");
            cursos.add("Engenharia de Software");
            cursos.add("Engenharia Civil");
            cursos.add("Engenharia de Produção");
            cursos.add("Engenharia Mecânica");
        }
        contador++;
    }
}
