package pe.edu.upeu.syscasos.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.syscasos.dao.UsuarioDAO;
import pe.edu.upeu.syscasos.entity.Usuario;
import pe.edu.upeu.syscasos.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioDAO dao;;

	@Override
	public Usuario create(Usuario a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Usuario update(Usuario a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
    
}
