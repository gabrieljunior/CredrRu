package br.ufc.ru.dao;

import br.ufc.ru.model.Movimento;
import java.util.ArrayList;

public class HistoricoDAO {
    private static ArrayList<Movimento> historico = new ArrayList<Movimento>();
    
    public static void gravar(Movimento movimento){
        historico.add(movimento);
    }
    
    public static ArrayList getHistorico(int codigo){
        ArrayList<Movimento> movimentos = new ArrayList<Movimento>();
        
        for(int i = 0; i < HistoricoDAO.historico.size(); i++){
            if(HistoricoDAO.historico.get(i).getCodigo() == codigo){
                movimentos.add(HistoricoDAO.historico.get(i));
            }
        }
        return movimentos;
    }
}
