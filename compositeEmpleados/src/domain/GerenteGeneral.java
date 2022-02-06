package domain;

import java.util.ArrayList;
import java.util.List;

public class GerenteGeneral implements Empleado {
	public List<Empleado> listaEmpleadosACargo;
	
	public GerenteGeneral(){
		this.listaEmpleadosACargo = new ArrayList<>();
	}
	
	@Override
	public void agregarEmpleadoACargo(Empleado empleadoNuevo) {
		listaEmpleadosACargo.add(empleadoNuevo);
	}
	
	@Override
	public void eliminarEmpleadoACargo(Empleado empleadoNuevo) {
		listaEmpleadosACargo.remove(empleadoNuevo);
	}
	
	@Override
	public int obtenerEmpleadosACargo() { // recursiva
		int empleadosACargo = 0;
		
		for(Empleado empleado: listaEmpleadosACargo) {
			empleadosACargo++;
		}
		
		return empleadosACargo;
	}

}
