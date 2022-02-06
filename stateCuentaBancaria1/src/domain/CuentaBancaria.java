package domain;

public class CuentaBancaria{
    private double saldo = 0;
    private Estado estadoDeLaCuenta;
    private boolean estaCerrada = false;

    public CuentaBancaria(){
        this.estadoDeLaCuenta = new EstadoCuentaNormal(this);
    }


    public void depositar(double monto){
        this.estadoDeLaCuenta.depositar(monto);
        this.actualizarEstado();
    }

    public void retirar(double monto){
        this.estadoDeLaCuenta.retirar(monto);
        this.actualizarEstado();
    }

    public void actualizarEstado(){
        if(!estaCerrada){
            if(this.saldo >= 0){
                this.estadoDeLaCuenta = new EstadoCuentaNormal(this);
            }
            else{
                this.estadoDeLaCuenta = new EstadoCuentaEnRojo(this);
            }
        }
    }

    public double obtenerSaldo(){
        return saldo;
    }

    public void aumentarSaldo(double monto){
        this.saldo += monto;
    }

    public void disminuirSaldo(double monto){
        this.saldo -= monto;
    }

    public void cerrarCuenta(){
        this.estadoDeLaCuenta = new EstadoCuentaCerrada(this);
        estaCerrada = true;
    }

    @Override
    public String toString(){
        return "Saldo: "+saldo+", Estado: "+estadoDeLaCuenta;
    }
}
