<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CredRU | Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <c:if test="${mensagens.existeErros}">
              <div id="erro">
                  <ul>
                      <c:forEach var="erro" items="${mensagens.erros}">
                          <li> ${erro} </li>
                          </c:forEach>
                  </ul>
              </div>
          </c:if>
        <form action="Controller">
            <input type="hidden" name="command" value="Autentica">
            Matrícula: <input type="number" name="matricula"><br>
            Senha: <input type="password" name="senha"><br>
            
            <input type="submit" name="entrar" value="Entrar"><br>
        </form>   
    </body>
</html>