
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h3>Cadastrar Aluno</h3>
        <form action="Controller">
            <input type="hidden" name="command" value="ValidaDadosAlunos">
            
            Matricula: <input type="number" name="codigo"><br>
            Nome Completo: <input type="text" name="nome"><br>
            Curso: <select name="curso">
                   
                   </select><br>
            Senha: <input type="text" name="senha" value="ufcrussas"><br>
            Status: 
            <input type="radio" name="status" value="ativo" checked>Ativo
            <input type="radio" name="status" value="inativo">Inativo<br>
            
            <input type="submit" name="salvar" value="Salvar">
            <input type="reset" name="limpar" value="Limpar">
        </form>
    </body>
</html>
