package org.example;


public class DatosReferenciados {

    public static void main(String[] args){

        //string(texto)
        String texto = "Hola mundo";

        //Array(Arreglos)
        int[] numeros = {1,2,3,4,5,6};

        //Clase personalizada(Objeto)
        Humano humano = new Humano("Andres", 22 );

        //Imprimir Valores
        System.out.println("string:" + texto);
        System.out.println("Array:" + numeros[0]);
        System.out.println("ObjetoNombre: " + humano.nombre);
        System.out.println("ObjetoEdad: " + humano.edad);

    }
}

//clase personalizada
class Humano{
    String nombre;
    int edad;

    Humano(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }
}