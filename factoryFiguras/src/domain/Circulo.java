package domain;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio="+radio+"]";
	}
}
