package domain;

public class AmarilloArriba extends Amarillo {

	public AmarilloArriba(Semaforo semaforo) {
		super(semaforo);
	}

	@Override
	public void cambiarColor() {
		semaforo.setColor(new Rojo(semaforo));		
	}

	@Override
	public String toString() {
		return "Semaforo en amarillo";
	}
	
}
