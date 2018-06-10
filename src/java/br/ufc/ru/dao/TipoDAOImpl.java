package br.ufc.ru.dao;

import br.ufc.ru.model.Tipo;
import br.ufc.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TipoDAOImpl implements TipoDao {

    @Override
    public Tipo getTipo(int id) {
        Tipo tipo = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            //String queryString = "from User where id = :id";
           // Query query = session.createQuery(queryString);
           // usuario = (Usuario) query.uniqueResult();
           tipo = (Tipo) session.get(Tipo.class, id);
                    
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
           // session.flush();
            session.close();
        }
        return tipo;

    }
    
    @Override
    public Tipo getTipo(String nomeTipo){
        Tipo tipo = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
           String queryString = "from tipo where nometipo = :nomeTipo";
           Query query = session.createQuery(queryString);
           tipo = (Tipo) query.uniqueResult();
           //tipo = (Tipo) session.get(Tipo.class, id);
                    
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
           // session.flush();
            session.close();
        }
        return tipo;
    }

    @Override
    public void updateTipo(Tipo tipo) {
      
    }

    @Override
    public void deleteTipo(int id) {
        
    }

    @Override
    public void adicionarTipo(Tipo tipo) {
        
    }
    
}
