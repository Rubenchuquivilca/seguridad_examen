package pe.edu.upeu.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import pe.edu.upeu.proyecto.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
