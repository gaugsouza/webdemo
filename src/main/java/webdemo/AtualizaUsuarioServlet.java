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
/**/
@WebServlet(name = "AtualizaUsuarioServlet", urlPatterns = {"atualizaUsuario"}, loadOnStartup = 1) 
public class AtualizaUsuarioServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        ArrayList<Usuario> usuarios =  UsuariosRepository.getUsuarios();   
        
        usuarios = this.listUpdate(usuarios, request);

        request.setAttribute("usuarios", usuarios);
        request.getRequestDispatcher("lista_usuario.jsp").forward(request, response); 
    }
    
    private ArrayList<Usuario> listUpdate(ArrayList<Usuario> usuarios, HttpServletRequest request){
        Integer id = Integer.valueOf(request.getParameter("id"));
        String novoNome = request.getParameter("nome");
        String novoSobrenome = request.getParameter("sobrenome");

        usuarios.get(id - 1).setNome(novoNome);
        usuarios.get(id - 1).setSobrenome(novoSobrenome);

        return usuarios;
    }
}