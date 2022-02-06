package domain;

public class Amarillo extends Color{

	public Amarillo(Semaforo semaforo) {
		super(semaforo);
	}

	@Override
	public void cambiarColor() {
		semaforo.setColor(new Verde(semaforo));
		// TODO: solo cambia a verde despues de amarillo. Falta que cambie a rojo 
	}

	@Override
	public String toString() {
		return "Semaforo en amarillo";
	}
	
	
}
