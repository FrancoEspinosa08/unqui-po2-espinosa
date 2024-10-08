package ar.edu.unq.po2.tp6;

public abstract class Solicitud {
	public Cliente cliente;
	private double monto;
	private int plazo;
	
	public Solicitud(Cliente cliente, double monto, int plazo) {
		super();
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}

	public double montoMensual() {
		return monto/plazo;
		
	}
	
	public double getMonto() {
		return monto;
	}
	
	public int getPlazo() {
		return plazo;
	}
	abstract boolean esAceptable();
}
