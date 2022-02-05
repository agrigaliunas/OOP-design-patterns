package domain;

public class CuentaBancaria{
    private double saldo = 0;
    private Estado estadoDeLaCuenta;
    private boolean estaCerrada = false;

    public CuentaBancaria(){
        this.estadoDeLaCuenta = new EstadoCuentaNormal();
    }


    public void depositar(double monto){
        this.saldo+=monto;
        this.actualizarEstado();
    }

    public void retirar(double monto){
        this.saldo-=monto;
        this.actualizarEstado();
    }

    public void actualizarEstado(){
        if(!estaCerrada){
            if(this.saldo >= 0){
                this.estadoDeLaCuenta = new EstadoCuentaNormal();
            }
            else{
                this.estadoDeLaCuenta = new EstadoCuentaEnRojo();
            }
        }
    }

    public double obtenerSaldo(){
        return this.saldo;
    }

    public void cerrarCuenta(){
        this.estadoDeLaCuenta = new EstadoCuentaCerrada();
        estaCerrada = true;
    }
}
