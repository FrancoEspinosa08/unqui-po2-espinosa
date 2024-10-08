package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends Solicitud{

	public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
		super(cliente, monto, plazo);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean esAceptable() {
		// TODO Auto-generated method stub
		return cliente.getSueldoAnual() >= 15000 && getMonto() <= cliente.getSueldoMensual() * 0.7;
	}
}
