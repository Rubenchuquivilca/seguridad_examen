package pe.edu.upeu.proyecto.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.proyecto.dao.ProductoDao;
import pe.edu.upeu.proyecto.entity.Producto;
import pe.edu.upeu.proyecto.services.ProductoService;


@Service
public class ProductoServiceImp implements ProductoService{
@Autowired
   private ProductoDao productoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	public String deleteProducto(Long id) {
		// TODO Auto-generated method stub
		if(productoDao.findById(id).isPresent()) {
			productoDao.deleteById(id);
			return "Producto eliminado correctamente.";
		}
		return "Error! El producto no existe";
	
	}

}
