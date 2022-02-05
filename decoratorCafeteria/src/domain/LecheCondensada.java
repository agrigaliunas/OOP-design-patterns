package domain;

public class LecheCondensada extends AdicionalDecorator{
	
	public LecheCondensada(Bebida bebidaAAgregarAdicional) {
		super(bebidaAAgregarAdicional);
	}
	
	public double obtenerPrecio() {
		return this.obtenerBebidaConAdicional().obtenerPrecio() + 45;
	}

}
