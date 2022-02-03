package domain;

public class Rectangulo extends Figura {
	private double alto;
	private double ancho;
	
	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [alto="+alto+", ancho="+ancho+"]";
	}
	
}
