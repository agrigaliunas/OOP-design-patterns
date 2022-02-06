package domain;

// rojo -> amarillo -> verde
// verde -> amarillo -> rojo

public class Semaforo{
	public Color colorActual;
	
	public Semaforo() {
		this.colorActual = new Rojo(this);
	}
	
	public String cambiarColor() {
		colorActual.cambiarColor();
		return colorActual.toString();
	}
	
	public void setColor(Color colorACambiar) {
		this.colorActual = colorACambiar;
	}
	
	
}
