package org.example;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el número de la tabla de multiplicar: ");
            int numero = scanner.nextInt();

            System.out.print("Tabla de multiplicar del: " + numero + ":");

            for (int i = 1; i<=10; i++){
                int resultado = numero * i;
                System.out.print(" " + numero + "x" + i + "=" + resultado);

                scanner.close();
            }
    }

}
