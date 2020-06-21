package pe.edu.upeu.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.entity.Categoria;
import pe.edu.upeu.proyecto.services.CategoriaService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CategoriaRestController {
@Autowired
  private CategoriaService categoriausuarioService;
@GetMapping("/categorias")
public List<Categoria> readAll(){
	return categoriausuarioService.findAll();	
}
@GetMapping("categorias/{id}")
public Categoria read(@PathVariable Long id) {
	return categoriausuarioService.findById(id);
	
}
@PostMapping("/categorias")
@ResponseStatus(HttpStatus.CREATED)
public Categoria create(@RequestBody Categoria categoria) {
	return categoriausuarioService.save(categoria);
	
}
@PutMapping("/categorias/{id}")
public Categoria update(@RequestBody Categoria categoria, @PathVariable Long id){
	Categoria actual_categoria = categoriausuarioService.findById(id);
			actual_categoria.setNomcat(categoria.getNomcat());		
	return categoriausuarioService.save(actual_categoria);
	
}
@DeleteMapping("/categorias/{id}")
public String deleteCategoria(@PathVariable Long id) {
	return categoriausuarioService.deleteCategoria(id);
	
}

}


