package pe.edu.upeu.proyecto.services;

import pe.edu.upeu.proyecto.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
