package org.example;
import java.util.ArrayList;
import java.util.List;

public class CanalYouTube implements Sujeto {
    private List<Observador> suscriptores = new ArrayList<>();

    @Override
    public void agregarObservador(Observador o){
        suscriptores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o){
        suscriptores.remove(o);
    }

    @Override
    public void notificarObservadores(String mensaje){
        for (Observador suscriptor : suscriptores){
            suscriptor.actualizar(mensaje);
        }
    }
//Método adicional para simular publicación de video
    public void subirVideo(String titulo){
        System.out.println("Nuevo video subido" + titulo);
        notificarObservadores("Nuevo video disponible: " + titulo);
    }
}
