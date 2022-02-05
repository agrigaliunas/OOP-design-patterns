package domain;

public class Canela extends AdicionalDecorator{
	
	public Canela(Bebida bebidaAAgregarAdicional) {
		super(bebidaAAgregarAdicional);
	}
	
	public double obtenerPrecio() {
		return this.obtenerBebidaConAdicional().obtenerPrecio() + 20;
	}

}
