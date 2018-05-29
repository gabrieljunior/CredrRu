<%-- 
    Document   : importa_alunos
    Created on : 27/05/2018, 08:35:01
    Author     : Gabriel Júnior
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.ru.dao.CursoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Importar Alunos</title>
    </head>
    <body>
        <h1>Importar Alunos</h1>
        <form action="Controller" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="command" value="ImportaAlunos">
            Selecione o curso:
            <select name="curso">
            <% CursoDAO.init();
               ArrayList<String> cursos = CursoDAO.getCursos();
               for(String curso : cursos){%>
                    <option><%=curso%></option>
            <% } %>
                   </select><br>
                   Arquivo: <input type="file" name="file"><br>
            <input type="submit" name="importar" value="Importar">
            
        </form>
        
    </body>
</html>
