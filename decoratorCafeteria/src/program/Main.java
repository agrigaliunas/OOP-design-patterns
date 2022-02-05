package program;
import domain.*;

public class Main {

	public static void main(String[] args) {
		Bebida cafe = new Cafe();

		AdicionalDecorator cafeConLeche = new Leche(cafe);
		
		AdicionalDecorator cafeConLecheYCanela = new Canela(cafeConLeche);
		
		System.out.println(cafeConLeche.obtenerPrecio());
		System.out.println("\n");
		System.out.println(cafeConLecheYCanela.obtenerPrecio());
		
	}

}
