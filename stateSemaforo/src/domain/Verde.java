package domain;

public class Verde extends Color {

	public Verde(Semaforo semaforo) {
		super(semaforo);
	}

	@Override
	public void cambiarColor() {
		semaforo.setColor(new Amarillo(semaforo));
	}

	@Override
	public String toString() {
		return "Semaforo en verde";
	}
	
}
