package org.example;

public interface Sujeto {
    void agregarObservador(Observador a);
    void eliminarObservador(Observador a);
    void notificarObservador(String mensaje);
}
