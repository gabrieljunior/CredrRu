<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ru" uri="/WEB-INF/tlds/converte"%>

<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PDV</title>
    </head>
    <body>
        <ru:converte valor="1.10"></ru:converte>
        <form action="Pagina">
            <input type="hidden" name="page" value="ProcuraUsuario">
            <input type="hidden" name="acao" value="debitar">
            
            Código: <input type="number" name="codigo">
            <input type="submit" name="ok" value="Ok"><br>
            
            
        </form>
    </body>
</html>