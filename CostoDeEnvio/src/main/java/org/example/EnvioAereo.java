package org.example;

public class EnvioAereo implements EstrategiaEnvio {
    @Override
    public void calcularCosto(double costo){
        System.out.println("El costo del envio aereo es de: $" + costo);
    }
}
