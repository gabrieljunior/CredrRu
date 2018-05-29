<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Debitar</title>
    </head>
    <body>
        <form action="Controller">
            <input type="hidden" name="command" value="RealizaDebito">
            <input type="hidden" name="codigo" value="${usuario.codigo}">
            
            Código: ${usuario.codigo}
            Nome Completo: ${usuario.nome}
            Valor da Refeição: ${usuario.tipo.valorRefeicao}
            
            <input type="submit" name="confirmar" value="Confirmar">
        </form>
    </body>
</html>
