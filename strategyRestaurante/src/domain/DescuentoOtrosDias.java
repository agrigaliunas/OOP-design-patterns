package domain;

public class DescuentoOtrosDias extends Descuento {
	Cuenta cuenta;

	public DescuentoOtrosDias(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	@Override
	public double calcularDescuento() {
		return 0;
	}

}
