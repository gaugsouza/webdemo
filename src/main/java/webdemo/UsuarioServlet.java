package webdemo;

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
        String httpMethod = request.getParameter("method");

        if(Integer.valueOf(request.getParameter("id")) != null){
            Integer id = Integer.valueOf(request.getParameter("id"));            
            if(httpMethod.equals("GET")){
                request.setAttribute("usuario", usuarios.get(id - 1));
                request.getRequestDispatcher("usuario.jsp").forward(request, response);             
            } else if(httpMethod.equals("PUT")) {
                request.setAttribute("usuario", usuarios.get(id - 1));
                request.getRequestDispatcher("atualiza_usuario.jsp").forward(request, response); 
            } else if(httpMethod.equals("DELETE")){
    
            }
        } else {
            request.setAttribute("usuarios", usuarios);
            request.getRequestDispatcher("lista_usuario.jsp").forward(request, response); 
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