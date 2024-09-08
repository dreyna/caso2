package pe.edu.upeu.syscasos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.syscasos.entity.Genero;

public interface GeneroService {
	Genero create(Genero a);
	Genero update(Genero a);
	void delete(Long id);
	Optional<Genero> read(Long id);
	List<Genero> readAll();
}
