package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        String eleccion = "";
        do {
            System.out.println("Elige una tabla del 2 hasta el 10 ");
            int numero = scanner.nextInt();
            if (numero < 2 || numero > 10){
                System.out.println("Error: número incorrecto");
                continue;
            }
            scanner.nextLine();
            System.out.println("Tabla del " + numero);

            for (int e = 1; e <= 10; e++) {
                int operacion = numero * e;
                System.out.println(numero + "x" + e + "=" + operacion);
            }
            System.out.println("Quieres ver otra tabla ? (S(si)/N(no)");
            eleccion = scanner.nextLine();

        } while (eleccion.equalsIgnoreCase("S"));
            if (eleccion.equalsIgnoreCase("N")){
                System.out.println("Saliste del programa ✋");
            }

    }
}