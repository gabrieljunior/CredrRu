<%@page import="br.ufc.ru.model.Tipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h3>Cadastrar Docente</h3>
        
        <form action="Controller">
            <input type="hidden" name="command" value="AdicionaDocente">
            Nome Completo: <input type="text" name="nome"><br>
            Matricula: <input type="number" name="matricula"><br>
            Senha: <input type="password" name="senha" value="ufcrussas"><br>
            <input type="radio" name="status" value="ativo" checked>Ativo
            <input type="radio" name="status" value="inativo">Inativo<br>
            <input type="submit" name="salvar" value="Salvar">
        </form>
    </body>
</html>