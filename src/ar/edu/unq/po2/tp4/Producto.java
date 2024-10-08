package ar.edu.unq.po2.tp4;

class Producto {
	String nombre;
	double precio;
	boolean esPrecioCuidado ;
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEsPrecioCuidado() {
		return esPrecioCuidado;
	}
	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	double calcularPrecio() {
		return precio;
		}
}

class ProductoPrimeraNecesidad extends Producto{
	int descuento;
	
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, int descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}


	@Override
    public double calcularPrecio() {
        return super.getPrecio() *  (1 - (descuento / 100.0)); 
    }
}