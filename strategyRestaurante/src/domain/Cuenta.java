package domain;

public class Cuenta {
	private double totalConsumido;
	private Descuento descuento;
	private FormaPago formaDePago;

	public Cuenta(double consumo, FormaPago formaDePago) {
		this.totalConsumido = consumo;
		this.formaDePago = formaDePago;
		this.descuento = new DescuentoOtrosDias(this); // supongamos que es lunes
	}
	
	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	
	public void setFormaPago(FormaPago formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	public double aplicarDescuento(){
		return descuento.calcularDescuento();
	}
	
	public double getTotalConsumido() {
		return this.totalConsumido;
	}
	
	public FormaPago getFormaPago() {
		return this.formaDePago;
	}
	
	public double getTotalConDescuento() {
		return totalConsumido-descuento.calcularDescuento();
	}
	
	@Override
	public String toString() {
		return "Monto: "+totalConsumido+", Forma de pago: "+formaDePago+", Descuento aplicado: "+descuento.calcularDescuento()+", Total: "+this.getTotalConDescuento();
	}
	
	
}
