package domain;

public class TrianguloRandomFactory extends FigurasRandomFactory{
	@Override
	public Triangulo crearFiguraRandom() {
		double alturaRandom = generadorNumeroRandom.nextDouble();
		double baseRandom = generadorNumeroRandom.nextDouble();
		return new Triangulo(baseRandom, alturaRandom);
	}
}
