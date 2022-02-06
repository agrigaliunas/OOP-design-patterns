package program;

import domain.CuentaBancaria;
import domain.EstadoCuentaNormal;

public class Main {
    public static void main(String args[]){

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(1000);
        System.out.println(cuenta);
        cuenta.retirar(2000);
        System.out.println(cuenta);
        cuenta.retirar(1000);
        cuenta.depositar(3000);
        System.out.println(cuenta);

        cuenta.cerrarCuenta();
        System.out.println(cuenta);
        cuenta.depositar(1000);




    }
}
