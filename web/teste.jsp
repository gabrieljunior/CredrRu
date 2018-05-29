<%-- 
    Document   : teste
    Created on : 27/05/2018, 12:50:18
    Author     : Gabriel Júnior
--%>

<%@page import="br.ufc.ru.dao.UsuarioDAO2"%>
<%@page import="br.ufc.ru.model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Teste</h1>
        <% ArrayList<Usuario> usuarios = UsuarioDAO2.users;
            for(Usuario usuario:usuarios){
                out.print(usuario.getCodigo() + " ");
                out.print(usuario.getNome() + " ");
            }
        %>
    </body>
</html>
