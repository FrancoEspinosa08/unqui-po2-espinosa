package ar.edu.unq.po2.tp6;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private double valor;
	public Propiedad(String descripcion, String direccion, double valor) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	
}
