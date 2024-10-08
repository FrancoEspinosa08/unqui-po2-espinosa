package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private List<Solicitud> solicitudes;
	public Banco() {
		this.clientes = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void agregarSolicitud(Solicitud solicitud) {
		if(solicitud.esAceptable()) {
			solicitudes.add(solicitud);
		}
		else {
			throw new IllegalArgumentException("La solicitud no es aceptable.");
		}
	}
	
	public int cantidadClientes() {
		return clientes.size();
	}
	public int cantidadSolicitudes() {
		return solicitudes.size();
	}
	public double montoTotalSolicitudes() {
		double total=0;
		for(Solicitud solicitud : solicitudes) {
			total+=solicitud.getMonto();
		}
		return total;
	}
}
