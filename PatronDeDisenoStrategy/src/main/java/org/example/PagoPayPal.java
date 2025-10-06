package org.example;

public class PagoPayPal implements EstrategiaPago {
    @Override
    public void pagar(double monto){
        System.out.println("Pagando $" + monto + "Usando PayPal.");
    }
}
