package ar.edu.unq.po2.tp4;

class Ingreso {
	String mes, concepto;
	Double monto;
	
	public Ingreso(String mes, String concepto, Double monto) {
		super();
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	public double getMonto() {
		// TODO Auto-generated method stub
		return monto;
	}
	
	public boolean esImponible() {
        return true;
    }

}
class IngresoHorasExtras extends Ingreso {
    int horasExtras;

    public IngresoHorasExtras(String mes, String concepto, double monto, int horasExtras) {
        super(mes, concepto, monto);
        this.horasExtras = horasExtras;
    }

    @Override
    public boolean esImponible() {
        return false; 
    }
}
