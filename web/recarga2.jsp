<%-- 
    Document   : recarga2
    Created on : 18/05/2018, 10:19:29
    Author     : Gabriel Júnior
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="br.ufc.ru.model.DAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recarga</title>
    </head>
    <body>
        <form action="recarga.jsp">
            <h1>Recarga</h1>
            Nome Completo: <%=UsuarioDAO.getUsers().get(1).getNome() %><br>
            Valor da Recarga: <br>
            <%  double almoco = UsuarioDAO.getUsers().get(1).getTipo().getValorRefeicao() * 5;
                double almocoJanta = UsuarioDAO.getUsers().get(1).getTipo().getValorRefeicao() * 10;
                Locale ptBr = new Locale("pt", "BR");
                String valor1 = NumberFormat.getCurrencyInstance(ptBr).format(almoco);
                String valor2 = NumberFormat.getCurrencyInstance(ptBr).format(almocoJanta);
            %>
            <input type="submit" name="almoco" value="<%=valor1%>">
            <input type="submit" name="almoco" value="<%=valor2%>">
        </form>
    </body>
</html>
