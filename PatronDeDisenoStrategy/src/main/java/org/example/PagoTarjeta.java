package org.example;

public class PagoTarjeta implements EstrategiaPago {
    @Override
    public void pagar (double monto){
        System.out.println("Pagando $" + monto + "Tarjeta de credito");
    }
}
