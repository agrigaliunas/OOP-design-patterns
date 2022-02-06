package domain;

public class DescuentoDomingo extends Descuento{
	Cuenta cuenta;

	public DescuentoDomingo(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	@Override
	public double calcularDescuento() { // si paga en efectivo es un 10%. Con tarjeta, importe normal
		double consumo = cuenta.getTotalConsumido();
		
		if(cuenta.getFormaPago().toString() == "Efectivo") { // esto es una mala practica, por que si agrego mas formas de pago														
			return consumo*0.1;								 // se terminan haciendo muchos if-else. Puede implementarse un State para el dia, o buscar otro metodo.
		}
		else {
			return consumo;
		}
		
	}

}
