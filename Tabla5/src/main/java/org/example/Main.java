package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        System.out.println("Elige una tabla del 2 hasta el 10");
        int numero = scanner.nextInt();
        int i = 0;



        System.out.println("Tabla del 2");
        for ( i = 0; i <= 10; i++){
            int operacion = numero * i;
            System.out.println(numero + "x" + i + "=" + operacion);
        }




    }
}