package program;

import domain.Semaforo;

public class Main {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo(); // empieza en rojo
		System.out.println(semaforo.colorActual);

		
		semaforo.cambiarColor(); // amarillo
		System.out.println(semaforo.colorActual);
		
		semaforo.cambiarColor(); // verde
		System.out.println(semaforo.colorActual);
		
		semaforo.cambiarColor(); // amarillo
		System.out.println(semaforo.colorActual);
		
		semaforo.cambiarColor(); // TODO: hacer que pase a rojo. Está pasando a verde.
		System.out.println(semaforo.colorActual);



	}

}
