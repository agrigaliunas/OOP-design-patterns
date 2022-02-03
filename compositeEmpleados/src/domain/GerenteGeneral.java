package domain;

import java.util.ArrayList;
import java.util.List;

public class GerenteGeneral implements Empleado {
	List<Empleado> ListaEmpleadosACargo;
	
	public GerenteGeneral(List<Empleado> empleadosACargo){
		this.ListaEmpleadosACargo = new ArrayList<>();
	}
	
	public void agregarEmpleadoACargo(Empleado empleadoNuevo) {
		ListaEmpleadosACargo.add(empleadoNuevo);
	}
	
	public void eliminarEmpleadoACargo(Empleado empleadoNuevo) {
		ListaEmpleadosACargo.remove(empleadoNuevo);
	}
	
	@Override
	public int obtenerEmpleadosACargo() { // recursiva
		int empleadosACargo = 0;
		
		for(Empleado empleado: ListaEmpleadosACargo) {
			empleadosACargo += empleado.obtenerEmpleadosACargo();
		}
		
		return empleadosACargo;
	}

}
