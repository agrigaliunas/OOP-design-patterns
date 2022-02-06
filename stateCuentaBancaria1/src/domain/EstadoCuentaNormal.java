package domain;

public class EstadoCuentaNormal extends Estado{

    public EstadoCuentaNormal(CuentaBancaria cuenta){
        super(cuenta);
    }

    public void depositar(double monto){
        cuenta.aumentarSaldo(monto);
    }

    public void retirar(double monto){
        cuenta.disminuirSaldo(monto);

    }

    @Override
    public String toString(){
        return "Cuenta normal";
    }
}
