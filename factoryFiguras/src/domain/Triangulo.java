package domain;

public class Triangulo extends Figura {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Triangulo [base="+base+", altura="+altura+"]";
	}
}
