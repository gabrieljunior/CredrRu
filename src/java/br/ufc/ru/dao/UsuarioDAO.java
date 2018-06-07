package br.ufc.ru.dao;

import br.ufc.ru.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public interface UsuarioDAO {
    public ArrayList<Usuario> getTodosUsuarios();
    public Usuario getUsuario(int codigo);
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Usuario usuario);
    public void adicionarUsuario(Usuario usuario);
}
