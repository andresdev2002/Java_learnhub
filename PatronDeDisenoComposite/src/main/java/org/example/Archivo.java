package org.example;

public class Archivo implements Componente {
    private String nombre;

    public Archivo(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void mostrar(){
        System.out.println("Archivo" + nombre);
    }
}
//Archivo es un Leaf (hoja) en el patrón Composite.
//
//Representa un objeto simple que no contiene otros elementos.
//
//Implementa mostrar() para imprimir su nombre.
//
//Ejemplo de uso: Archivo foto.jpg.
