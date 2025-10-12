package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    ServicioMeteorologico reporte = new ServicioMeteorologico();

    Observador Us1 = new AplicacionMovil("Andres");
    Observador Us2 = new PanelPublico("Emiliano");

        reporte.agregarObservador(Us1);
        reporte.agregarObservador(Us2);
        reporte.notificarObservador(" El dia de hoy va ser un dia calido");
        reporte.notificarObservador(" Se espera un dia lluvioso");


    }
}