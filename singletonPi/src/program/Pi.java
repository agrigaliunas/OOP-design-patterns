package program;

public class Pi {
	private static Pi instanciaUnica;
	public double valorPi;
	
	private Pi(double valorPi) {
		this.valorPi = valorPi;
	}
	
	public static Pi getInstance() {
		if(instanciaUnica == null) {
			instanciaUnica = new Pi(Math.PI);
			
		}
		return instanciaUnica;
	}
	
	public void setValorPi(double valorPi) {
		this.valorPi = valorPi;
	}
	
	public double getValorPi() {
		return valorPi;
	}
}
