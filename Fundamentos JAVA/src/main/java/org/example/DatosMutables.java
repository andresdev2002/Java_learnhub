package org.example;
//Arreglo(Array)
public class DatosMutables {
    public static void main(String[] args){
        int[] numeros = {1,2,3,4,5,6};
        numeros[0] = 39;//Cambiamos el primer valor a 39
        System.out.println("El nuevo valor es: " + numeros[0]);

        //Clases personalizadas(Objetos)
        Persona2 a = new Persona2("Andres");
        a.nombre = "Gilberto";
        System.out.print("Mi nombre es: " + a.nombre);

    }
}

//Clases personalizadas(Objetos)
class Persona2{
    String nombre;//Esta variable se usara para guardar el nombre de la persona
     //Conductor de la clase
    Persona2(String nombre){
        this.nombre = nombre;// asigna el valor del parámetro al atributo de la clase
    }
}

