package domain;

public class EstadoCuentaCerrada extends Estado{
    public EstadoCuentaCerrada(CuentaBancaria cuenta){
        super(cuenta);
    }

    public void depositar(double monto){
        System.out.println("No es posible depositar si su cuenta esta cerrada.\n");
    }

    public void retirar(double monto){
        if(cuenta.obtenerSaldo() >= monto){
            cuenta.disminuirSaldo(monto);
        }
    }

    @Override
    public String toString(){
        return "Cuenta cerrada";
    }
}
