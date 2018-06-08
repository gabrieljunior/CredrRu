
<%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.ru.dao.CursoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css" />
        <title>Cadastro</title>
    </head>
    <body>
        <section class="hero has-background-light is-fullheight">
            <div class="hero-body has-background-light">
                <div class="column is-4 is-offset-4">
                    <p class="title has-text-centered">
                        <strong>Cadastrar Aluno</strong>
                    </p>
                        <form action="Pagina">
                            <input type="hidden" name="page" value="AdicionaUsuario">
                            
                            <div class="field">
                                <div class="field">
                                <label class="label">Código</label>
                                    <div class="control">
                                        <input class="input" type="text" name="codigo" placeholder="Digite o código">
                                    </div>
                                </div>
                                <div class="field">
                                <label class="label">Nome Completo</label>    
                                    <div class="control">
                                        <input class="input" type="text" name="nome" placeholder="Digite o nome completo">
                                    </div>
                                </div>
                                <div class="field">
                                <label class="label">Curso</label>
                                <div class="control">
                                    <div class="select">
                                        <select name="curso">
                                        <% CursoDAO.init();
                                        ArrayList<String> cursos = CursoDAO.getCursos();
                                        for(String curso : cursos){%>
                                        <option><%=curso%></option>
                                        <%}%>
                                        </select>
                                    </div>
                                </div>
                                </div>
                                        
                        <div class="field">
                            <label class="checkbox" name="yes">
                                <input type="checkbox">
                                <strong>Beneficiário PRAE</strong>
                            </label>
                        </div>
                            <div class="field">
                                <label class="label">Senha</label>    
                                    <div class="control">
                                        <input class="input" type="password" name="senha" value="ufcrussas">
                                    </div>
                            </div>
                            <div class="field">
                            <div class="control">
                                <strong>Status &nbsp;</strong>
                                <label class="radio">
                                    <input type="radio" name="status" value="ativo" checked>
                                    Ativo
                                </label>
                                <label class="radio">
                                    <input type="radio" name="status" value="inativo">
                                    Inativo
                                </label>
                            </div>
                            </div>
                            <div class="control is-grouped-centered">
                                <button type="submit" class="hero-buttons button is-primary is-fullwidth"><strong>Cadastrar<strong></button>
                            </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
