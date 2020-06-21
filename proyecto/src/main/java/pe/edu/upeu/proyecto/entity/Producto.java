package pe.edu.upeu.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto implements Serializable{
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idproducto;

@Column(length = 45)
private String nomprod;
private double precio;
private int cantidad;
private Long idcategoria;
public Long getIdproducto() {
	return idproducto;
}
public void setIdproducto(Long idproducto) {
	this.idproducto = idproducto;
}
public String getNomprod() {
	return nomprod;
}
public void setNomprod(String nomprod) {
	this.nomprod = nomprod;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public Long getIdcategoria() {
	return idcategoria;
}
public void setIdcategoria(Long idcategoria) {
	this.idcategoria = idcategoria;
}

}