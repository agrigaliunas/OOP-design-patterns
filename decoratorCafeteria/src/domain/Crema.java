package domain;

public class Crema extends AdicionalDecorator{
	public Crema(Bebida bebidaAAgregarAdicional) {
		super(bebidaAAgregarAdicional);
	}
	
	public double obtenerPrecio() {
		return this.obtenerBebidaConAdicional().obtenerPrecio() + 10;
	}
}
