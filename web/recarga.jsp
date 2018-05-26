<%@page import="br.ufc.ru.model.DAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recarga</title>
    </head>
    <body>
        <h1>Recarga</h1>
        <form action="recarga.jsp">
            Código: <input type="number" name="codigo">
            <input type="submit" name="OK" value="OK">
        </form>
        <%if(request.getParameter("codigo") != null && request.getParameter("codigo").isEmpty() != true){
            for(int i = 0; i < UsuarioDAO.getUsers().size(); i++){
                if(UsuarioDAO.getUsers().get(i).getCodigo() == Integer.parseInt(request.getParameter("codigo"))){
                    if(UsuarioDAO.getUsers().get(i).isAtivo() != false){
                        RequestDispatcher rd = request.getRequestDispatcher("recarga2.jsp");
                        rd.forward(request, response);
                    }else{
                        out.print("O Usuário não existe ou não está ativo!");
                    }
                }
            }
        }%>
    </body>
</html>
