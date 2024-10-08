package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class tp4Test {

	Producto dulceDeLeche = new Producto("dulceDeLeche", 1000.0, true);
	Producto manteca = new Producto("manteca", 1500.0, false);
	ProductoPrimeraNecesidad leche = new ProductoPrimeraNecesidad("leche", 100.0, true, 10);
	
	Supermercado coto = new Supermercado("coto", "belgrano 1500");
	
	@Test
	public void test1() {
			coto.agregarProducto(dulceDeLeche);
			coto.agregarProducto(manteca);
			Assertions.assertEquals(2500, coto.calcularPrecioTodos());
			Assertions.assertEquals(2, coto.calcularTotalProductos());

	}
	@Test
	public void test2() {
		coto.agregarProducto(leche);
		Assertions.assertEquals(90, coto.calcularPrecioTodos());
	}
	
	Ingreso ingreso1 = new Ingreso("Enero", "Sueldo", 3000.0);
	Ingreso ingreso2 = new Ingreso("Febrero", "Sueldo", 3000.0);
	Ingreso ingreso3 = new IngresoHorasExtras("Febrero", "Extra", 500.0, 4);
	
	Trabajador trabajador = new Trabajador();
	
	@Test
	public void test3() {
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
		Assertions.assertEquals(6500, trabajador.getTotalPercibido());
		Assertions.assertEquals(6000, trabajador.getMontoImponible());
		Assertions.assertEquals(120, trabajador.getImpuestoAPagar());
	}
}


