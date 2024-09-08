package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Rol;

public interface RolDAO {

	Rol create(Rol a);
	Rol update(Rol a);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}
