package br.ufc.ru.model.DAO;

import br.ufc.ru.model.Pessoa;
import java.util.ArrayList;

public class UsuarioDAO {
    private static ArrayList<Pessoa> users = new ArrayList<Pessoa>();

    public ArrayList<Pessoa> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Pessoa> users) {
        UsuarioDAO.users = users;
    }
    
    public static void gravar(Pessoa p){
        users.add(p);
    }
}
