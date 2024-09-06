package ar.edu.unq.po2.tp2;

public class Concepto {
		double sueldoBruto, retencion;
		
		public Concepto(double sueldoBruto, double retencion) {
			super();
			this.sueldoBruto = sueldoBruto;
			this.retencion = retencion;
		}
		
		public double getSueldoBruto() {
			return sueldoBruto;
		}

		public void setSueldoBruto(double sueldoBruto) {
			this.sueldoBruto = sueldoBruto;
		}

		public double getRetencion() {
			return retencion;
		}

		public void setRetencion(double retencion) {
			this.retencion = retencion;
		}

		
}
