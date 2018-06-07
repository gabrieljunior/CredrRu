package br.ufc.ru.dao;

import br.ufc.ru.model.Movimento;
import br.ufc.ru.model.Usuario;
import java.util.ArrayList;

public interface HistoricoDAO {
    public ArrayList<Movimento> getTodosMovimentos();
    public Movimento getMovimento(int codigo);
    public void updateMovimento(Movimento movimento);
    public void deleteMovimento(Movimento movimento);
    public void adicionarMovimento(Movimento movimento);
}
