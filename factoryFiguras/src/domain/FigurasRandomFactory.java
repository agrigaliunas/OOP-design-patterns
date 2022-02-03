package domain;
import java.util.Random;

public abstract class FigurasRandomFactory {
	public Random generadorNumeroRandom = new Random();
	
	public abstract Figura crearFiguraRandom();
}
