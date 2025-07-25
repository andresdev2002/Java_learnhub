//Estructura de clase y objetos
package org.example;
public class CocheClaseObjetos {
//Atributos
    String marca;
    String color;
    //Método
    void acelerar(){
        System.out.println("El coche esta acelerando");
    }
    //Constructor
    public CocheClaseObjetos(String marca, String color){
        this.marca = marca;
        this.color = color;

    }
}

//Implementación de objetos a nuestro código
class Main{
    public static void main(String[] args){
        CocheClaseObjetos carro = new CocheClaseObjetos("Toyota","Negro" );
        carro.acelerar();
    }
}

