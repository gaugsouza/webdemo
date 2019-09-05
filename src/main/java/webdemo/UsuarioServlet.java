package org.gradle.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import webdemo.entidades.Usuario;
import webdemo.entidades.UsuariosRepository;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"usuario"}, loadOnStartup = 1) 
public class UsuarioServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        ArrayList<Usuario> usuarios =  UsuariosRepository.getUsuarios();        
        if(request.getParameter("id") == null){            
            request.setAttribute("usuarios", usuarios);
            request.getRequestDispatcher("lista_usuario.jsp").forward(request, response); 
        } else{
            Integer id = Integer.valueOf(request.getParameter("id"));
            request.setAttribute("usuario", usuarios.get(id - 1));
            request.getRequestDispatcher("usuario.jsp").forward(request, response); 
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        ArrayList<Usuario> usuarios =  UsuariosRepository.getUsuarios();
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        Integer id = (usuarios.get(usuarios.size() - 1)).getId() + 1;
        
        UsuariosRepository.addUsuario(new Usuario(id, nome, sobrenome));        
        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("lista_usuario.jsp").forward(request, response); 
    }
}