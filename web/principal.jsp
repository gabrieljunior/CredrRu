
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>
        <h1>MENU</h1>
        <!Substituir esse if pelo if do Java Core>
        
        <c:if test="${tipo.nome == 'Servidor'}">
            <a href="CredRu/admin.jsp">ADMIN</a>
        </c:if>
        Vc é ${tipo.nome}
        Olá ${usuario.nome}, Seja bem vindo!
        Vc está ${usuario.status}
        SALDO: ${usuario.saldo}
        
        HISTÓRICO DE CONSUMO
    </body>
</html>
