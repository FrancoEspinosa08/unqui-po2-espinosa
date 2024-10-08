package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	String nombre, direccion;
	List<Producto> productos;

	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<>();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	public int calcularTotalProductos() {
		return productos.size();
	}
	
	public double calcularPrecioTodos() {
		double precioTodosLosProductos = 0;
		for(Producto producto:productos) {
			precioTodosLosProductos+=producto.calcularPrecio();
		}
		return precioTodosLosProductos;
	}
}
