package br.ufc.ru.dao;

import br.ufc.ru.model.Tipo;
import java.util.ArrayList;
import java.util.List;

public class TipoDAOImpl {
    static ArrayList<Tipo> tipos = new ArrayList<Tipo>();
    
    /*public TipoDAOImpl(){
        tipos = new ArrayList<Tipo>();
    }
    
    @Override
    public List<Tipo> getTodosTipos() {
        return tipos;
    }

    @Override
    public Tipo getTipo(int codigo) {
        for(int i = 0; i < tipos.size(); i++){
            if(tipos.get(i).getCodigo() == codigo){
                return tipos.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateTipo(Tipo tipo) {
        adicionarTipo(getTipo(tipo.getCodigo()));
    }

    @Override
    public void deleteTipo(Tipo tipo) {
         tipos.remove(getTipo(tipo.getCodigo()));
    }
    
    @Override
    public void adicionarTipo(Tipo tipo){
        tipos.add(tipo);
    */
}
