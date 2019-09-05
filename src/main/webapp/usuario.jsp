<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Usuario n° ${usuario.id}</title>
        <link rel="stylesheet" href="styles/usuario.css">
    </head>
    <body>
        <h2>Usuario #${usuario.id}</h2>
        <div class="container">
            <span>
                <span class="topic"> Id: </span> ${usuario.id}
            </span>
            <span>
                <span class="topic"> Nome: </span> ${usuario.nome} 
            </span>
            <span>
                <span class="topic"> Sobrenome: </span> ${usuario.sobrenome}
            </span>
            <a href="usuario"> Home </a>
        </div>
    </body>
</html>