package org.example;

public class DatosInmutables {
    public static void main(String[] args){

        String saludo = "Hola Mundo"; //Se crea un objeto String llamado saludo con el valor "Hola".
            saludo.concat(" Soy Andres");//Agregamos el nuevo texto utilizando concat

        System.out.println("Texto completo " + saludo);

        String nuevoTexto = saludo + " Soy Andres";

        System.out.println("Nuevo texto: " + nuevoTexto);
    }
}
