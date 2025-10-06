package org.example;

public class Tienda {
    private EstrategiaPago estrategiaPago;

    public void setEstrategiaPago(EstrategiaPago estrategiaPago){
        this.estrategiaPago = estrategiaPago;
    }

    public void realizarPago(double monto){
        if (estrategiaPago == null){
            System.out.println("No se ha seleccionado un método de pago");
        }else{
            estrategiaPago.pagar(monto);
        }
    }
}
