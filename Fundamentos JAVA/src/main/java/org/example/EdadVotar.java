package org.example;
import java.util.Scanner;

public class EdadVotar {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, vienvenido al sistema de votación");
        System.out.print("Escriba su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.print("Usted puede votar");
        }else{
            System.out.print("usted es menor de edad, por ende no puede votar");
        }

        scanner.close();
    }
}
