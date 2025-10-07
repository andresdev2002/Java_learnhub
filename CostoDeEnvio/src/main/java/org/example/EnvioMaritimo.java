package org.example;

public class EnvioMaritimo implements EstrategiaEnvio {
    @Override
    public void calcularCosto(double costo){
        System.out.println("El costo del envío marítimo es de: $" + costo);
    }

}
