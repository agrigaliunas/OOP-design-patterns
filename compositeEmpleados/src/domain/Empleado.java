package domain;

public interface Empleado {
	public abstract int obtenerEmpleadosACargo();
	public abstract void agregarEmpleadoACargo(Empleado empleadoNuevo);
	public abstract void eliminarEmpleadoACargo(Empleado empleadoNuevo);

}
