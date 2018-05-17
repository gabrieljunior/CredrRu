<%-- 
    Document   : config
    Created on : 13/04/2018, 17:20:55
    Author     : Gabriel Júnior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CredRU</title>
    </head>
    <body>
        <h1>Configurações</h1>
        <p><B>Valores das Refeições</B></p>
        <p>Aluno <input type="text" name="valorAluno"> Servidor TAE <input type="text" name="valorTAE"> 
            Servidor Docente <input type="text" name="valorDocente"> </p>
        <p><B>Horario das Refeições </B></p>
        <p>Almoço <input type="text" name="almocoIni"> as <input type="text" name="almocoFin"> 
           Jantar <input type="text" name="jantarIni"> as <input type="text" name="jntarFin"> </p>
        <p><B>Horario da Venda de Credito </B></p>
        <p>Manhã <input type="text" name="manhaIni"> as <input type="text" name="manhaFin"> 
           Tarde <input type="text" name="tardeIni"> as <input type="text" name="tarderFin"> </p>
        <p>
           <input type="submit" name="Salvar">
           <input type="reset" name="Cancelar">
        </p>
        
    </body>
</html>
