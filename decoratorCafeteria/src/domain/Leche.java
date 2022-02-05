package domain;

public class Leche extends AdicionalDecorator{

	public Leche(Bebida bebidaAAgregarAdicional) {
		super(bebidaAAgregarAdicional);
	}
	
	public double obtenerPrecio() {
		return this.obtenerBebidaConAdicional().obtenerPrecio() + 40;
	}
	
	
}
