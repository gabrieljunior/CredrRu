<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensagem</title>
    </head>
    <body>
        valor = <%=request.getParameter("valor")%>
        <h1><%=request.getParameter("acao")%> realizado com sucesso!</h1><br>
        <br>
        <a href="index.jsp">VOLTAR</a>
    </body>
</html>
