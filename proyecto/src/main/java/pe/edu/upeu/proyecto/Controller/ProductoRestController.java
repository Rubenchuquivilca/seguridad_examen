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

import pe.edu.upeu.proyecto.entity.Producto;
import pe.edu.upeu.proyecto.services.ProductoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {
@Autowired
private ProductoService productousuarioService;
@GetMapping("/productos")
public List<Producto> readAll(){
	return productousuarioService.findAll();
	
}
@GetMapping("productos/{id}")
public Producto read(@PathVariable Long id) {
	return productousuarioService.findById(id);
}
@PostMapping("/productos")
@ResponseStatus(HttpStatus.CREATED)
public Producto create(@RequestBody Producto producto) {
	return productousuarioService.save(producto);
}
@PutMapping("/productos/{id}")
public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
	Producto actual_producto = productousuarioService.findById(id);
	         actual_producto.setNomprod(producto.getNomprod());
	         actual_producto.setPrecio(producto.getPrecio());
	         actual_producto.setCantidad(producto.getCantidad());
	         actual_producto.setIdcategoria(producto.getIdcategoria());
			return productousuarioService.save(actual_producto);
	         
}
@DeleteMapping("/productos/{id}")
public String deleteProducto(@PathVariable Long id) {
	return productousuarioService.deleteProducto(id);
}
}
