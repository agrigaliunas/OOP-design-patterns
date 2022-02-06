package domain;

public class AmarilloAbajo extends Amarillo {

	public AmarilloAbajo(Semaforo semaforo) {
		super(semaforo);
	}

	@Override
	public void cambiarColor() {
		semaforo.setColor(new Verde(semaforo));		
	}

	@Override
	public String toString() {
		return "Semaforo en amarillo";
	}
	
}
