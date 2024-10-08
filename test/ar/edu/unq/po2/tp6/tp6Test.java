package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tp6Test {
	Banco banco = new Banco();
    Cliente juan = new Cliente("Juan", "Perez", "Mitre 2000", 30, 2000.0);
    SolicitudCreditoPersonal solicitudPersonalJuan = new SolicitudCreditoPersonal(juan, 500.0, 6);
	@Test
    public void test1() {
        banco.agregarCliente(juan);
        assertEquals(1, banco.cantidadClientes());
        banco.agregarSolicitud(solicitudPersonalJuan);
        assertEquals(1, banco.cantidadSolicitudes());
    }

}
