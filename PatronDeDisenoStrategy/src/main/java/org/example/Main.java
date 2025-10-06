package org.example;


public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        tienda.setEstrategiaPago(new PagoTarjeta());
        tienda.realizarPago(150.0);

        tienda.setEstrategiaPago(new PagoPayPal());
        tienda.realizarPago(80.0);

        tienda.setEstrategiaPago(new PagoCripto());
        tienda.realizarPago(100.0);
    }
}