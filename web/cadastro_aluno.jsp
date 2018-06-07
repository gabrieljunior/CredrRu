
<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.ru.dao.CursoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Cadastro</title>
    </head>
    <body>
        <h3>Cadastrar Aluno</h3>
        <form action="Pagina">
            <input type="hidden" name="page" value="AdicionaUsuario">
            
            Código: <input type="number" name="codigo"><br>
            Nome Completo: <input type="text" name="nome"><br>
            Curso: <select name="curso">
                    <% CursoDAO.init();
                        ArrayList<String> cursos = CursoDAO.getCursos();
                          for(String curso : cursos){%>
                          <option><%=curso%></option>
                          <%}%>
                   </select><br>
                   <input type="checkbox" name="beneficiario"> Beneficiário PRAE<br/>
            Senha: <input type="text" name="senha" value="ufcrussas"><br>
            Status: 
            <input type="radio" name="status" value="ativo" checked>Ativo
            <input type="radio" name="status" value="inativo">Inativo<br>
            
            <input type="submit" name="salvar" value="Salvar">
            <input type="reset" name="limpar" value="Limpar">
        </form>
    </body>
</html>
