package pe.edu.upeu.proyecto.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.proyecto.dao.CategoriaDao;
import pe.edu.upeu.proyecto.entity.Categoria;
import pe.edu.upeu.proyecto.services.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
@Autowired
   private CategoriaDao categoriaDao;
	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDao.save(categoria);
	}

	@Override
	public String deleteCategoria(Long id) {
		// TODO Auto-generated method stub
		if(categoriaDao.findById(id).isPresent()) {
			categoriaDao.deleteById(id);
			return "Categoria eliminado correctamente.";
		}
		return "Error! La categoria no existe";
	}

	
}
