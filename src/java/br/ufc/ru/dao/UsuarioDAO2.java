package br.ufc.ru.dao;

import br.ufc.ru.model.Usuario;
import java.util.ArrayList;

public class UsuarioDAO2 {
    public static ArrayList<Usuario> users = new ArrayList<Usuario>();
    
    public static Usuario getUsuario(int matricula){
        for(Usuario usuario:users){
            if(usuario.getCodigo() == matricula)
                return usuario;
        }
        return null;
    }
}
