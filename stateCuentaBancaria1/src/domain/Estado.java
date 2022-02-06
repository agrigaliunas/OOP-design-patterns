package domain;

public abstract class Estado {
    CuentaBancaria cuenta;

    public Estado(CuentaBancaria cuenta){
        this.cuenta = cuenta;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);
}
