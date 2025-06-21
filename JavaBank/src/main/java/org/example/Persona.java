package org.example;
import java.util.Scanner;

public class Persona {
    //Declaramos las caracteristicas de cada objeto o atributos de la clase
    String nombre;
    int edad;
    //Constructor para crear objetos persona
    public Persona(String nombre, int edad){
        this.nombre= nombre;
        this.edad = edad;
    }

    //Metodo para saludar

    public void saludar(){
        System.out.print("Hola me llamo " + nombre + " y tengo " + edad + " años");
    }

    //Metodo principal para probar la clase
    public static void main(String[] args){
        Persona persona1 = new Persona("Andres", 22);//crear un objeto
        persona1.saludar();

    }

}
//El this Guarda el valor que llegó como parámetro nombre en el atributo nombre del objeto que se está creando."
//this para diferenciar entre el atributo y el parámetro cuando tienen el mismo nombre.