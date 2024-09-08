package pe.edu.upeu.syscasos.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.syscasos.dao.PeliculaDAO;
import pe.edu.upeu.syscasos.entity.Pelicula;
import pe.edu.upeu.syscasos.repository.PeliculaRepository;

@Component
public class PeliculaDaoImpl implements PeliculaDAO{

	@Autowired
	private PeliculaRepository repository;
	
	@Override
	public Pelicula create(Pelicula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Pelicula update(Pelicula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
