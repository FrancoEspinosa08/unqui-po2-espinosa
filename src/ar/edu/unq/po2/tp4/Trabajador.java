package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
		List<Ingreso> ingresos;
		
		
		public Trabajador() {
			super();
			this.ingresos = new ArrayList<>();
		}
		
		public void agregarIngreso(Ingreso ingreso) {
			ingresos.add(ingreso);
		}
		
		public double getTotalPercibido() {
			double precioTotal=0;
			for(Ingreso ingreso:ingresos) {
				precioTotal+=ingreso.getMonto();
			}
			return precioTotal;
		}
		
		public double getMontoImponible() {
	        double montoImponible = 0;
	        for (Ingreso ingreso : ingresos) {
	            if (ingreso.esImponible()) {
	                montoImponible += ingreso.getMonto();
	            }
	        }
	        return montoImponible;
	    }
		
		public double getImpuestoAPagar() {
	        double montoImponible = getMontoImponible();
	        return montoImponible * 0.02;
	    }
}
