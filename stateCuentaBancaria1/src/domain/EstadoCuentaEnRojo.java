package domain;

public class EstadoCuentaEnRojo extends Estado{
    public EstadoCuentaEnRojo(CuentaBancaria cuenta){
        super(cuenta);
    }

    public void depositar(double monto){
        cuenta.aumentarSaldo(monto);
    }

    public void retirar(double monto){
        System.out.println("No es posible retirar si su cuenta está en rojo.\n");
    }

    @Override
    public String toString(){
        return "Cuenta en rojo";
    }
}
