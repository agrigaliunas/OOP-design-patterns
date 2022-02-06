package domain;

public abstract class Amarillo extends Color{

	public Amarillo(Semaforo semaforo) {
		super(semaforo);
	}

	@Override
	public String toString() {
		return "Semaforo en amarillo";
	}
	
	
}
