package domain;

public class Archivo implements Unidad{
	private double tamano;
	
	public Archivo(double tamano) {
		this.tamano = tamano;
	}
	
	@Override
	public double tamanoTotal() {
		return this.tamano;
	}

	
}
