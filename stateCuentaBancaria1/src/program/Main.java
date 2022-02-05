package program;

import domain.CuentaBancaria;
import domain.EstadoCuentaNormal;

public class Main {
    public static void main(String args[]){

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(1000);
    }
}
