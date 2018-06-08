<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.ru.dao.HistoricoDAOImpl"%>
<%@page import="br.ufc.ru.dao.HistoricoDAO"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css"/>
    </head>
    <body>
        <%HistoricoDAO historicoDAO = new HistoricoDAOImpl();
          ArrayList movimentos = historicoDAO.getMovimentoUsurio(Integer.parseInt(request.getParameter("codigo"))); 
          request.setAttribute("movimentos", movimentos);
        %>
        
        <h1>Histórico de Consumo</h1>
        
        <table class="table is-striped">
            <thead>
                <tr>
                    <th>Data</th>
                    <th>Hora</th>
                    <th>Descricao</th>
                    <th>Valor</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="movimento" items="${movimentos}">
                <tr>
                    <td>${movimento.data}<td/>
                    <td>${movimento.hora}<td/>
                    <td>${movimento.descricao}<td/>
                    <td>${movimento.toString()}<td/>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
