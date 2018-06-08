
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css"/>
        <title>Recarga</title>
    </head>
    <body>
        <section class="hero has-background-light is-fullheight">
            <div class="hero-body has-background-light">
                <div class="column is-4 is-offset-4">
                    <div class="box"> 
                        <p class="title has-text-centered">
                            <strong>Código</strong>
                        </p>
                        <form action="Pagina">
                            <input type="hidden" name="page" value="ProcuraUsuario">
                            <input type="hidden" name="acao" value="recarga">
                            <div class="field">
                                <div class="control">
                                    <input class="input" type="text" name="codigo" placeholder="Digite o código">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>  
            </div>
        </section>
    </body>
</html>
