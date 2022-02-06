package program;

import domain.Semaforo;

public class Main {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		
		semaforo.cambiarColor();
		System.out.println(semaforo.colorActual);
		semaforo.cambiarColor();
		System.out.println(semaforo.colorActual);
		semaforo.cambiarColor();
		System.out.println(semaforo.colorActual);
		semaforo.cambiarColor();
		System.out.println(semaforo.colorActual);



	}

}
