package domain;

public class Chocolate extends AdicionalDecorator {
	
	public Chocolate(Bebida bebidaAAgregarAdicional) {
		super(bebidaAAgregarAdicional);
	}
	
	public double obtenerPrecio() {
		return this.obtenerBebidaConAdicional().obtenerPrecio() + 50;
	}
}
