package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> empleados = new ArrayList<>();
		Empresa empresa = new Empresa("Metrogas", "114567892", empleados);
		@SuppressWarnings("deprecation")
		Empleado empleado1 = new EmpleadoPermanente("Mauro", "Mitre 123", "casado", new Date(2002, 1, 15), 50000, 2, 10);
        @SuppressWarnings("deprecation")
		Empleado empleado2 = new EmpleadoTemporario("Candela", "Belgrano 456", "soltero", new Date(2000, 5, 10), 30000, 20, new Date(125, 0, 1));
        @SuppressWarnings("deprecation")
		Empleado empleado3 = new EmpleadoContratado("Leila", "Onsari 1200", "soltero", new Date(1998, 3, 22), 60000, 1, "Transferencia Bancaria");
        
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        
        System.out.println("El total de sueldos netos es de "+empresa.calcularTotalSueldosNetos());
        List<ReciboDeHaberes> recibos = empresa.liquidarSueldos();
        for (ReciboDeHaberes recibo : recibos) {
            System.out.println("Recibo de Haberes de " + recibo.getNombreEmpleado());
            System.out.println("Dirección: " + recibo.getDireccion());
            System.out.println("Fecha de Emisión: " + recibo.getFechaEmision());
            System.out.println("Sueldo Bruto: " + recibo.getSueldoBruto());
            System.out.println("Sueldo Neto: " + recibo.getSueldoNeto());
	}
    }
}
