package org.example;

public class DatosPrimitivos {
    public static void main(String[] args){
        //Números enteros
        byte edadByte = 22;
        short edadShort = 20;
        int edadInt = 22;
        long edadLong = 34;

        //Números decimales
        float alturaFloat = 1.74f;//A los números flotantes se les coloca la "f" al final
        double pesoDouble = 70.5;

        //Caracteres
        char inicial = 'A' ;// Se colocan comillas simples

        //Booleanos

        boolean esMayor = true;

        System.out.println("byte: " + edadByte);
        System.out.println("short: " + edadShort);
        System.out.println("int : " + edadInt);
        System.out.println("long: " + edadLong);
        System.out.println("float: " + alturaFloat);
        System.out.println("double: " + pesoDouble);
        System.out.println("char : " + inicial);
        System.out.println("Booleano: " + esMayor);




    }
}
