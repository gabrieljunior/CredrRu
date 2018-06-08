package br.ufc.ru.dao;
import br.ufc.ru.model.Movimento;
import java.util.ArrayList;

public class HistoricoDAOImpl implements HistoricoDAO{
    static ArrayList<Movimento> historicos = new ArrayList<Movimento>();
    
    @Override
    public ArrayList<Movimento> getTodosMovimentos() {
        return historicos;
    }
    
    @Override
    public ArrayList<Movimento> getMovimentoUsurio(int codigo){
        ArrayList<Movimento> historico = null;
        for(Movimento movimento : historicos){
            if(movimento.getCodigo() == codigo){
                if(historico == null){
                    historico = new ArrayList<Movimento>();
                }
                historico.add(movimento);
            }
        }
        return historico;
    }
    
    @Override
    public Movimento getMovimento(int codigo) {
        for(int i = 0; i < historicos.size(); i++){
            if(historicos.get(i).getCodigo() == codigo){
                return historicos.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateMovimento(Movimento movimento) {
        adicionarMovimento(getMovimento(movimento.getCodigo()));
    }

    @Override
    public void deleteMovimento(Movimento movimento) {
         historicos.remove(getMovimento(movimento.getCodigo()));
    }
    
    @Override
    public void adicionarMovimento(Movimento movimento){
        historicos.add(movimento);
    }
}
