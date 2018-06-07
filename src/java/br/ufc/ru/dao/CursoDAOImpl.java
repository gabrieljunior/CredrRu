package br.ufc.ru.dao;

import br.ufc.ru.model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoDAOImpl {
    static ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    public CursoDAOImpl(){
        cursos = new ArrayList<Curso>();
    }
    /*
    @Override
    public List<Curso> getTodosCursos() {
        return cursos;
    }

    @Override
    public Curso getCurso(int codigo) {
        for(int i = 0; i < cursos.size(); i++){
            if(cursos.get(i).getCodigo() == codigo){
                return cursos.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateCurso(Curso curso) {
        adicionarCurso(getCurso(curso.getCodigo()));
    }

    @Override
    public void deleteCurso(Curso curso) {
         cursos.remove(getCurso(curso.getCodigo()));
    }
    
    @Override
    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }*/
}
