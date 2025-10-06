package org.example;

public class PagoCripto implements EstrategiaPago {
    public void pagar(double monto){
        System.out.println("Pagando $" + monto + "Criptomonedas");
    }
}
