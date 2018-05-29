
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recarga</title>
        <script type="text/javascript">
            <!– function submitenter(myfield,e){
                var keycode;
                if (window.event) keycode = window.event.keyCode;
                else if (e) keycode = e.which;
                else return true;
                if (keycode == 13){
                    myfield.form.submit();
                    return false;
                }else
                    return true;
                }
            //–>
        </script>
    </head>
    <body>
        <form action="Controller">
            <input type="hidden" name="command" value="ProcuraUsuario">
            <input type="hidden" name="acao" value="recarga">
            Código: <input type="number" name="matricula" onKeyPress="return submitenter(this,event)">
            <input type="submit" name="ok" value="Ok"><br>
        </form>
    </body>
</html>
