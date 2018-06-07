<%@page import="br.ufc.ru.model.Tipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h3>Cadastrar Servidor TAE</h3>
        <!Colocar os possiveis erros que pode acontecer: Campo vazio, usuario já cadastrado>
        <form action="Pagina" method="POST">
            <input type="hidden" name="page" value="AdicionaUsuario">
            
            Nome Completo: <input type="text" name="nome"><br>
            Matricula: <input type="number" name="codigo"><br>
            Senha: <input type="password" name="senha" value="ufcrussas"><br>
            <input type="radio" name="status" value="ativo" checked>Ativo
            <input type="radio" name="status" value="inativo">Inativo<br>
            <input type="submit" name="salvar" value="Salvar">
        </form>
    </body>
</html>