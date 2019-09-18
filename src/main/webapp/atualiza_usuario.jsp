<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Usuario n° ${usuario.id}</title>
        <link rel="stylesheet" href="styles/usuario.css">
    </head>
    <body>
        <h2 class="updateTitle">Usuario #${usuario.id}</h2>
        <form method="get" action="atualizaUsuario?id=${usuario.id}" class="updateContainer">
            <div>
                <span class="topic"> Id: </span> ${usuario.id}
                <input type="hidden" name="id" value="${usuario.id}">
            </div>
            <div>
                <span class="topic"> Nome: </span>  
                <input class="input-text" type="text" id="say-hello-text-input" name="nome" value="${usuario.nome}" />
            </div>
            <div>
                <span class="topic"> Sobrenome: </span>
                <input class="input-text" type="text" id="say-hello-text-input" name="sobrenome" value="${usuario.sobrenome}" />
            </div>
            <input class="input-button" type="submit" id="say-hello-button" value="Atualizar" />
            <a href="usuario"> Home </a>
        </form>
    </body>
</html>