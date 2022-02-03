package domain;

public class CirculoRandomFactory extends FigurasRandomFactory{
	@Override
	public Circulo crearFiguraRandom() {
		double radioRandom = generadorNumeroRandom.nextDouble();
		return new Circulo(radioRandom);
	}
}
