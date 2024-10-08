package ar.edu.unq.po2.tp2;
import java.util.ArrayList;
import java.util.Date;

public abstract class Empleado {
	String nombre;
	String direccion;
	String estadoCivil;
	Date fechaNacimiento;
	double sueldo;
	public Empleado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, int sueldo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldo = sueldo;
	}
	int obraSocial() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	@SuppressWarnings("deprecation")
	public int calcularEdad() {
		Date today = new Date();
        return today.getYear() - fechaNacimiento.getYear();
	}
	
	abstract double calcularSueldoBruto();
	
	abstract double calcularSueldoRetencion();
	
	public double calcularSueldoNeto() {
		return calcularSueldoBruto()-calcularSueldoRetencion();
	}
	
	public ReciboDeHaberes generarReciboDeHaberes() {
        return new ReciboDeHaberes(nombre, direccion, new Date(), calcularSueldoBruto(), calcularSueldoNeto(), new ArrayList<>());
    }

}

class EmpleadoPermanente extends Empleado{
	int cantHijos, añosAntiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, int sueldo,
		int cantHijos, int añosAntiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldo);
		this.cantHijos = cantHijos;
		this.añosAntiguedad = añosAntiguedad;
	}

	@Override
	double calcularSueldoBruto() {
		// TODO Auto-generated method stub
		return asignacionPorConyuge()+asignacionPorHijo()+asignacionAntiguedad()+sueldo;
	}

	@Override
	double calcularSueldoRetencion() {
		//10% de su sueldo bruto + $20 por cada hijo. Aportes Jubilatorios: 15% de su sueldo bruto
		return 0.10*calcularSueldoBruto()+20*cantHijos+0.15*calcularSueldoBruto();
	}
	public double asignacionPorHijo() {
		return cantHijos*150;
	}
	public int asignacionPorConyuge() {
		if (estadoCivil.equals("casado")) {
	        return 100; 
	    } else {
	        return 0; 
	    }}
	public int asignacionAntiguedad() {
		return 50*añosAntiguedad;
	}
}

class EmpleadoTemporario extends Empleado{
	int horasExtra;
	Date fechaFinDesignacion;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, int sueldo,
		int horasExtra, Date fechaFinDesignacion) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldo);
		this.horasExtra = horasExtra;
		this.fechaFinDesignacion = fechaFinDesignacion;
	}
	
	@Override
	double calcularSueldoBruto() {
		// TODO Auto-generated method stub
		return sueldo+(40*horasExtra);
	}
	@Override
	double calcularSueldoRetencion() {
		// TODO Auto-generated method stub
		return 0.1*calcularSueldoBruto()+aporteJubilatorio()+(0.1*calcularSueldoBruto()+horasExtra*5);
	}
	public int aporteJubilatorio() {
		// TODO Auto-generated method stub
		if(calcularEdad()>50) {
			return 25;
		}
		else {return 0;}
	}
	public int calcularHorasExtra() {
		return horasExtra*40;
	}
}

class EmpleadoContratado extends Empleado{
	int numeroContrato;
	String medioDePago;
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, Date fechaNacimiento, int sueldo,
			int numeroContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldo);
		this.numeroContrato = numeroContrato;
		this.medioDePago = medioDePago;
	}
	@Override
	double calcularSueldoBruto() {
		// TODO Auto-generated method stub
		return sueldo;
	}
	@Override
	double calcularSueldoRetencion() {
		// TODO Auto-generated method stub
		return 50;
	}
	
}




