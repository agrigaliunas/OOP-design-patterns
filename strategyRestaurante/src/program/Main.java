package program;

import domain.*;

public class Main {
	
	public static void main(String[] args) {
		FormaPago efectivo = new Efectivo();
		FormaPago tarjeta = new Tarjeta();
		
		Cuenta cuenta = new Cuenta(2600, efectivo);
		
		System.out.println(cuenta);
		
		cuenta.setDescuento(new DescuentoMiercoles(cuenta));
		
		System.out.println(cuenta);
		
		cuenta.setDescuento(new DescuentoDomingo(cuenta));

		System.out.println(cuenta);

		cuenta.setFormaPago(tarjeta);
		
		System.out.println(cuenta);

	}

}
