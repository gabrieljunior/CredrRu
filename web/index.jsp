<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.ru.model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CredRU</title>
    </head>
    <body>
        
        <a href="Pagina?page=ExibeCadastroAluno">Cadastrar Alunos</a>
        
        <form action="Pagina?page=Login" method="POST">
            
            <input type="submit" name="entrar" value="Entrar">
        </form>
        
        <div>
            <h4>Cardápio Semanal</h4>
            <table border='1px' >
                <tr>
                    <td>ALMOÇO</td>
                </tr>
                <tr>
                    <th>Segunda</th>
                    <th>Terça</th>
                    <th>Quarta</th>
                    <th>Quinta</th>
                    <th>Sexta</th>
                </tr>
                
                <%-- pegar esses dados do banco de dados e incluir na tabela --%>
                <tr>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                </tr>
                
                <tr>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                    <td> </td>
                </tr>
                
            </table>
            
        </div>
        
        <div>
            Horário das Refeições <br>
            <%-- pegar esses dados do banco --%>
        </div>
        
        <div>
            Horário de Venda de Créditos<br>
            <%-- pegar esses dados do banco --%>
        </div>
    </body>
</html>
