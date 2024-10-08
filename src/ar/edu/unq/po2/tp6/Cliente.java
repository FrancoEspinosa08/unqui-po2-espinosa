package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private double sueldoMensual;
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoMensual = sueldoMensual;
	}
	public double getSueldoAnual() {
		return sueldoMensual*12;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getEdad() {
		return edad;
	}
	double getSueldoMensual() {
		return sueldoMensual;
	}
	public void solicitarCredito(Solicitud solicitud, Banco banco) {
		banco.agregarSolicitud(solicitud);
	}
}
