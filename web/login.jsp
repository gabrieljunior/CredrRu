<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href=".../css/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css" />
        
        <title>CredRU | Login</title>
    </head>
    <body>
        <section class="hero has-background-light is-fullheight">
            
        <div class="hero-body">
            <div class="column is-4 is-offset-4">
                
        <div class="box" >
        <p class="title has-text-centered">
            <strong>Login</strong>
        </p>
        
        <form action="Pagina">
            <input type="hidden" name="page" value="Autentica">
            
            <div class="field">
                <label class="label">Código</label>
                <div class="control">
                    <input class="input " type="text" name="codigo" pattern="[0-9]*" placeholder="Digite o seu código">
                </div>
            </div>
            
            <div class="field">
                <label class="label">Senha</label>
                <div class="control">
                    <input class="input" type="password" name="senha" placeholder="Digite sua senha">
                </div>
            </div>
            
            <c:if test="${mensagens.existeErros}">
              <div class="control has-text-danger">
                  <ul>
                      <c:forEach var="erro" items="${mensagens.erros}">
                          
                              <li> ${erro} </li>
                          
                          </c:forEach>
                  </ul>
              </div>
            </c:if>
            
            <div class="control is-grouped-centered">
                <button type="submit" class="hero-buttons button is-primary is-fullwidth"><strong>Entrar<strong></button>
            </div>
        </form>
        </div>
        </div>
        </div>
        
        </section>
    </body>
</html>