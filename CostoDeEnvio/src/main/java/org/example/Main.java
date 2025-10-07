package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TransporteMultimodal transporteMultimodal = new TransporteMultimodal();

        transporteMultimodal.setEstrategiaEnvio(new EnvioAereo());
        transporteMultimodal.realizarPagoEnvio(100);

        transporteMultimodal.setEstrategiaEnvio(new EnvioMaritimo());
        transporteMultimodal.realizarPagoEnvio(150);

        transporteMultimodal.setEstrategiaEnvio(new EnvioTerrestre());
        transporteMultimodal.realizarPagoEnvio(100);
    }
}