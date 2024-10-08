package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends Solicitud{
	public Propiedad propiedad;
	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazo, Propiedad propiedad) {
		super(cliente, monto, plazo);
		// TODO Auto-generated constructor stub
		this.propiedad=propiedad;
	}
	
	@Override
	boolean esAceptable() {
		// TODO Auto-generated method stub
		return getMonto() <= cliente.getSueldoMensual() * 0.5 && getMonto() < propiedad.getValor() * 0.7 && cliente.getEdad() + (getPlazo() / 12) <= 65;
	}
}