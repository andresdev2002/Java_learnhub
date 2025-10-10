package org.example;

public interface Sujeto {
    void agregarObservadores(Observador a);
    void eliminarObservadores(Observador a);
    void notificarObservadores(String mensaje);
}
