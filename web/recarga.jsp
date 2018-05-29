<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recarga</title>
    </head>
    <body>
        <h1>Recarga</h1>
        <form action="Controller">
            <input type="hidden" name="command" value="RealizaRecarga">
            
            
            Código: ${usuario.codigo}<br><br>
            
            Nome Completo: ${usuario.nome}<br>
            
            Valor da Recarga:<br>
            <input type="submit" name="opcao" value="${credito.almoco}">
            <input type="submit" name="opcao" value="${credito.almocoJanta}">
        </form>
    </body>
</html>
