package org.example;

public class TransporteMultimodal {
    private EstrategiaEnvio estrategiaEnvio;

    public void setEstrategiaEnvio(EstrategiaEnvio estrategiaEnvio){
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public void realizarPagoEnvio(double costo){
        if (estrategiaEnvio == null){
            System.out.print("No se ha seleccionado método de envío");
        }else {
            estrategiaEnvio.calcularCosto(costo);
        }
    }
}
