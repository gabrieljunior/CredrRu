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
        <h3>Cadastrar Aluno</h3>
        <%  
            //Colocar na página inicial
            
            //CADASTRO DOS TIPOS DE USUÁRIO
            Tipo t = new Tipo();
            t.setNome("Aluno");
            t.setValorRefeicao(1.10);
            TipoDAO.gravar(t);
            
            Tipo t1 = new Tipo();
            t1.setNome("Aluno Residente");
            t1.setValorRefeicao(0.00);
            TipoDAO.gravar(t1);
            
            Tipo t2 = new Tipo();
            t2.setNome("Servidor Docente");
            t2.setValorRefeicao(2.20);
            TipoDAO.gravar(t2);
            
            Tipo t3 = new Tipo();
            t2.setNome("Servidor TAE");
            t2.setValorRefeicao(1.60);
            TipoDAO.gravar(t3);
            
            //Os cursos deverão ser cadastrados pelo o Admin
            //Perguntar ao Marcos se é necessário ter cadastro de cursos
            CursoDAO.gravar("Engenharia de Software");
            CursoDAO.gravar("Engenharia Civil");
            CursoDAO.gravar("Engenharia Mecanica");
            CursoDAO.gravar("Engenharia de Produção");
            CursoDAO.gravar("Ciencia da Computação");
        %>
        
        <form action="cadastro_aluno.jsp">
            Nome Completo: <input type="text" name="nome"><br>
            Matricula: <input type="text" name=" matricula"><br>
            Curso: <select name="curso">
                   <%for(String curso : CursoDAO.getCursos()){%>
                        <option><%=curso%></option>
                    <%}%>
                   </select><br>
                   Senha: <input type="password" name="senha"><br>
                   <input type="radio" name="status" value="ativo" checked>Ativo
                   <input type="radio" name="status" value="inativo">Inativo<br>
            <input type="submit" name="salvar" value="Salvar">
        </form>
        
        <%if(request.getParameter("nome") != null && request.getParameter("nome").isEmpty() != true){
            if(request.getParameter("matricula") != null && request.getParameter("matricula").isEmpty() != true){
                if(request.getParameter("curso") != null && request.getParameter("curso").isEmpty() != true){
                    Pessoa a1 = new Pessoa();
                    a1.setTipo(TipoDAO.get("Aluno"));
                    a1.setNome(request.getParameter("nome"));
                    a1.setCodigo(Integer.parseInt(request.getParameter("matricula")));
                    a1.setCurso(request.getParameter("curso"));
                    
                    String value = request.getParameter("status");
                    if(value.equals("ativo")){
                       a1.setAtivo(true);
                    }else{
                       a1.setAtivo(false);
                    }
                    
                    UsuarioDAO.gravar(a1);
                }
            }
        }%>
    </body>
</html>
