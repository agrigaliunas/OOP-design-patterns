package domain;

public class RectanguloRandomFactory extends FigurasRandomFactory{
	@Override
	public Rectangulo crearFiguraRandom() {
		double altoRandom = generadorNumeroRandom.nextDouble();
		double anchoRandom = generadorNumeroRandom.nextDouble();
		return new Rectangulo(altoRandom, anchoRandom);
	}
}
