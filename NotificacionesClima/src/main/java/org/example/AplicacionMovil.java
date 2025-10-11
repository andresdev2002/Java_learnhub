package org.example;

public class AplicacionMovil implements Observador {
    private String nombre;

    public AplicacionMovil(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje){
        System.out.println(nombre + " ha recibido la notificación" + mensaje);
    }
}
