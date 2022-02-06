package domain;

public class Rojo extends Color{

	public Rojo(Semaforo semaforo) {
		super(semaforo);
	}

	@Override
	public void cambiarColor() {
		semaforo.setColor(new Amarillo(semaforo));
	}

	@Override
	public String toString() {
		return "Semaforo en rojo";
	}
	
}
