package org.example;

import java.util.Scanner;// Importamos la clase Scanner, que nos permite leer datos del teclado.

public class SumaNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el primer número :");
            int numero1 = scanner.nextInt();

        System.out.print("Escriba el segundo número: ");
            int numero2 = scanner.nextInt();

            int suma = numero1 + numero2;

            System.out.print("El resultado de la suma es: " + suma);

             scanner.close(); //Nos permite cerrar el objeto para no recibir mas datos
    }
}