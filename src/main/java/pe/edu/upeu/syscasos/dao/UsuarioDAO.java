package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Usuario;

public interface UsuarioDAO {

	Usuario create(Usuario a);
	Usuario update(Usuario a);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
}
