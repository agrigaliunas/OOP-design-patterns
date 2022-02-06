package domain;

public abstract class Color {
	Semaforo semaforo;
	
	public Color(Semaforo semaforo) {
		this.semaforo = semaforo;
	}
	
	public abstract void cambiarColor();
}
