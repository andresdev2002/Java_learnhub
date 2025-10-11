package org.example;
import java.util.ArrayList;
import java.util.List;

public class ServicioMeteorologico implements Sujeto{
    private List<Observador> Observadores = new ArrayList<>();

    @Override
    public void agregarObservador(Observador a){
        Observadores.add(a);
    }

    @Override
    public void eliminarObservador(Observador a){
        Observadores.remove(a);

    }
    @Override
    public void notificarObservador(String mensaje){
        for (Observador a : Observadores){
           a.actualizar(mensaje);
        }
    }

}
