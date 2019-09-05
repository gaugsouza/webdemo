<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Usuarios</title>
        <link rel="stylesheet" href="styles/lista_usuario.css">
    </head>
    <body>
        <div class="container">
            <div class="item">
                <h2>Lista</h2>
                <ul style="display: inline;">
                    <c:forEach var="usuario" items="${usuarios}">
                        <li>
                            ${usuario.id}, ${usuario.nome}&nbsp;${usuario.sobrenome}
                            <a href="usuario?id=${usuario.id}">Detalhar</a>
                        </li>
                        
                    </c:forEach>
                </ul>
            </div>
            <form method="post" action="usuario" class="item">  
                <h2>Adicionar</h2>
                <div class="sub-item">
                    <h4>Nome:</h4>
                    <input class="input-text" type="text" id="say-hello-text-input" name="nome" />
                    <h4>Sobrenome:</h4>
                    <input class="input-text" type="text" id="say-hello-text-input" name="sobrenome" />    
                </div>
			    <input class="input-button" type="submit" id="say-hello-button" value="Adicionar" />
		    </form>
        </div>	
    </body>
</html>