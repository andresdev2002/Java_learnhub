package org.example;

public class EnvioTerrestre implements EstrategiaEnvio {
    @Override
    public void calcularCosto(double costo){
        System.out.println("El costo del envío terrrestre es de: $" + costo);
    }
}
