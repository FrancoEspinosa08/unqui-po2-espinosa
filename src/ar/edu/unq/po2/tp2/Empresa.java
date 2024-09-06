package ar.edu.unq.po2.tp2;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	String nombre, cuit;
	List<Empleado> empleados;
	
	public Empresa(String nombre, String cuit, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public double calcularTotalSueldosNetos() {
	    double totalSueldosNetos = 0;
	    for (Empleado empleado : empleados) {
	        totalSueldosNetos += empleado.calcularSueldoNeto();
	    }
	    return totalSueldosNetos;
	}

	public double calcularTotalSueldosBrutos() {
	    double totalSueldosBrutos = 0;
	    for (Empleado empleado : empleados) {
	        totalSueldosBrutos += empleado.calcularSueldoBruto();
	    }
	    return totalSueldosBrutos;
	}

	public double calcularTotalRetenciones() {
	    double totalRetenciones = 0;
	    for (Empleado empleado : empleados) {
	        totalRetenciones += empleado.calcularSueldoRetencion();
	    }
	    return totalRetenciones;
	}
	
	public List<ReciboDeHaberes> liquidarSueldos() {
        List<ReciboDeHaberes> recibos = new ArrayList<>();
        for (Empleado empleado : empleados) {
            recibos.add(empleado.generarReciboDeHaberes());
        }
        return recibos;
    }
}

