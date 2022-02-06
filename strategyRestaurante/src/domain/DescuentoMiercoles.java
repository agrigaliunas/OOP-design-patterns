package domain;

public class DescuentoMiercoles extends Descuento{
	Cuenta cuenta;

	public DescuentoMiercoles(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	@Override
	public double calcularDescuento() {
		double consumo = cuenta.getTotalConsumido();
		return  consumo*0.2;
	}

}
