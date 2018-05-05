<%@page import="br.ufc.ru.model.DAO.UsuarioDAO"%>
<%@page import="br.ufc.ru.model.Pessoa"%>
<%@page import="br.ufc.ru.model.DAO.TipoDAO"%>
<%@page import="br.ufc.ru.model.DAO.CursoDAO"%>
<%@page import="br.ufc.ru.model.Tipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h3>Cadastrar Servidor TAE</h3>
        
        <form action="cadastro_servidor.jsp">
            Nome Completo: <input type="text" name="nome"><br>
            Matricula: <input type="text" name=" matricula"><br>
            Senha: <input type="password" name="senha"><br>
            <input type="radio" name="status" value="ativo" checked>Ativo
            <input type="radio" name="status" value="inativo">Inativo<br>
            <input type="submit" name="salvar" value="Salvar">
        </form>
        
        <%if(request.getParameter("nome") != null && request.getParameter("nome").isEmpty() != true){
            if(request.getParameter("matricula") != null && request.getParameter("matricula").isEmpty() != true){
                Pessoa a1 = new Pessoa();
                a1.setTipo(TipoDAO.get("Servidor TAE"));
                a1.setNome(request.getParameter("nome"));
                a1.setCodigo(Integer.parseInt(request.getParameter("matricula")));
                a1.setSenha(request.getParameter("senha"));
                String value = request.getParameter("status");
                if(value.equals("ativo")){
                    a1.setAtivo(true);
                }else{
                    a1.setAtivo(false);
                }
                UsuarioDAO.gravar(a1);
            }
        }%>
    </body>
</html>