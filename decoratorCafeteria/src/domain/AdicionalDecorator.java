package domain;

public abstract class AdicionalDecorator implements Bebida {
	protected Bebida bebida;
	
	public AdicionalDecorator(Bebida bebidaAAgregarAdicional) {
		this.bebida = bebidaAAgregarAdicional;
	}
	
	public Bebida obtenerBebidaConAdicional() {
		return bebida;
	}

}
