package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Usuario;

public interface UsuarioService {
	Usuario create(Usuario a);
	Usuario update(Usuario a);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
}
