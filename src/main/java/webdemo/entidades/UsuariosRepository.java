package webdemo.entidades;

import java.util.ArrayList;

public class UsuariosRepository {
	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	
    public static ArrayList<Usuario> getUsuarios(){
		if(usuarios.size() == 0) {
			usuarios.add(new Usuario(1,"Frank", "Ocean"));
			usuarios.add(new Usuario(2,"Tyler", "The Creator"));
			usuarios.add(new Usuario(3,"Earl", "Sweatshirt"));
		}		
		return usuarios;
	}
	public static void addUsuario(Usuario u) {
		usuarios.add(u);
	}

	public static Usuario getUsuario(int id){
		for(Usuario u:usuarios) {
			if(u.getId() == id) {
				return u;
			}
		}
		return null;
	}
}