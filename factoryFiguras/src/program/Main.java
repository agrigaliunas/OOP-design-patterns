package program;

import domain.CirculoRandomFactory;
import domain.FigurasRandomFactory;
import domain.RectanguloRandomFactory;
import domain.TrianguloRandomFactory;

public class Main {

	public static void main(String[] args) {
		FigurasRandomFactory factoryTriangulos = new TrianguloRandomFactory();
		FigurasRandomFactory factoryRectangulos = new RectanguloRandomFactory();
		FigurasRandomFactory factoryCirculos = new CirculoRandomFactory();
		
		System.out.println(factoryTriangulos.crearFiguraRandom());
		System.out.println(factoryRectangulos.crearFiguraRandom());
		System.out.println(factoryCirculos.crearFiguraRandom());


	}

}
