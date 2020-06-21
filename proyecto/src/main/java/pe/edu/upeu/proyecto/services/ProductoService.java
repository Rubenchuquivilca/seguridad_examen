package pe.edu.upeu.proyecto.services;

import java.util.List;

import pe.edu.upeu.proyecto.entity.Producto;

public interface ProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
    public Producto save(Producto producto);
    
    public String deleteProducto(Long id);
}
