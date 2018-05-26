<%@page import="br.ufc.ru.model.DAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CredRU | Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login.jsp">
            Matrícula: <input type="text" name="matricula"><br>
            Senha: <input type="text" name="senha"><br>
            
            <input type="submit" name="entrar" value="Entrar"><br>
            
        </form>
        
    </body>
</html>