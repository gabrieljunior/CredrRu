<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Debitar</title>
    </head>
    <body>
        <form action="Pagina">
            <input type="hidden" name="page" value="RealizaDebito">
            <input type="hidden" name="codigo" value="${usuario.codigo}">
            
            Código: ${usuario.codigo}<br>
            Nome Completo: ${usuario.nome}<br>
            Valor da Refeição: ${usuario.tipo.valorRefeicao}<br>
            
            <input type="submit" name="confirmar" value="Confirmar">
        </form>
    </body>
</html>
