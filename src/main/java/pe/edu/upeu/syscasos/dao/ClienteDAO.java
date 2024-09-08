package pe.edu.upeu.syscasos.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Cliente;

public interface ClienteDAO {

	Cliente create(Cliente a);
	Cliente update(Cliente a);
	void delete(Long id);
	Optional<Cliente> read(Long id);
	List<Cliente> readAll();
}
