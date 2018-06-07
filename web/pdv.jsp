<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PDV</title>
    </head>
    <body>
        <form action="Pagina">
            <input type="hidden" name="page" value="ProcuraUsuario">
            <input type="hidden" name="acao" value="debitar">
            
            Código: <input type="number" name="codigo">
            <input type="submit" name="ok" value="Ok"><br>
        </form>
    </body>
</html>
