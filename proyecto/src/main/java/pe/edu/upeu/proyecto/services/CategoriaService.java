package pe.edu.upeu.proyecto.services;

import java.util.List;

import pe.edu.upeu.proyecto.entity.Categoria;

public interface CategoriaService {
    public List<Categoria> findAll();
    public Categoria findById(Long id);
    public Categoria save(Categoria categoria);
    
    public String deleteCategoria(Long id);
    
}
