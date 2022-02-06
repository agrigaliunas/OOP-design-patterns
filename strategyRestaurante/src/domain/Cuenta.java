package domain;

public class Cuenta {
	private double totalConsumido;
	private Descuento descuentoAplicado;
	private FormaPago formaDePago;

	public Cuenta(double consumo, FormaPago formaDePago) {
		this.totalConsumido = consumo;
		this.formaDePago = formaDePago;
		this.descuentoAplicado = new DescuentoOtrosDias(); // supongamos que es lunes
	}
	
}
