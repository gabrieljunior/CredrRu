package br.ufc.ru.dao;

import br.ufc.ru.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO{
    List<Usuario> usuarios;
    
    public UsuarioDAOImpl(){
        usuarios = new ArrayList<Usuario>();
    }
    
    @Override
    public List<Usuario> getTodosUsuarios() {
        return usuarios;
    }

    @Override
    public Usuario getUsuario(int codigo) {
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getCodigo() == codigo){
                return usuarios.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        adicionarUsuario(getUsuario(usuario.getCodigo()));
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
         usuarios.remove(getUsuario(usuario.getCodigo()));
    }
    
    @Override
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
}
