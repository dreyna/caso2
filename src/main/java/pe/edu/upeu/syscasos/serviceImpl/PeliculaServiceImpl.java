package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.PeliculaDAO;
import pe.edu.upeu.syscasos.entity.Pelicula;
import pe.edu.upeu.syscasos.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService{

	@Autowired
	private PeliculaDAO dao;

	@Override
	public Pelicula create(Pelicula a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Pelicula update(Pelicula a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}
