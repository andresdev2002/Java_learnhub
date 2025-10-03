package org.example;
import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Componente  {
    private String nombre;
    private List<Componente> elementos = new ArrayList<>();

    public Carpeta(String nombre){
        this.nombre = nombre;
    }

    public void agregar(Componente componente){
        elementos.add(componente);
    }
    public void eliminar(Componente componente){
        elementos.remove(componente);
    }
    @Override
    public void mostrar(){
        System.out.println("Carpeta: " + nombre);
        for (Componente c : elementos){
            c.mostrar();
        }
    }
}
