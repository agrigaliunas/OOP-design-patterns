package domain;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Unidad{
	public List<Unidad> listaUnidadesEnCarpeta;

	public Carpeta() {
		this.listaUnidadesEnCarpeta = new ArrayList<>();
	}
	
	public void agregarUnidad(Unidad unidad) {
		listaUnidadesEnCarpeta.add(unidad);
	}

	public void quitarUnidad(Unidad unidad) {
		listaUnidadesEnCarpeta.remove(unidad);
	}
	
	@Override
	public double tamanoTotal() { // usamos recursividad en la funcion
		double tamanoCalculado = 0;
		
		for(Unidad unidad: listaUnidadesEnCarpeta) {
			tamanoCalculado += unidad.tamanoTotal();
		}
		
		return tamanoCalculado;
	}

}
