package domain;

import program.Pi;

public class Main {

	public static void main(String[] args) {

		Pi numeroPi = Pi.getInstance();
		
		System.out.println(numeroPi.getValorPi());
	}

}
