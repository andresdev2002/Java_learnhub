package org.example;

public class PanelPublico implements Observador{
    private String nombre;

    public PanelPublico(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje){
        System.out.println(nombre + " ha recibido la notificación" + mensaje);
    }
}
