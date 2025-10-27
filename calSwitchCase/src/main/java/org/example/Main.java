package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("Elije 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir, 5 Salir");
        opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Escribe el primer valor de la operación");
                int a = scanner.nextInt();
                System.out.println("Escribe el segundo valor de la operacion");
                int b = scanner.nextInt();
                int operacion1 = a + b;
                System.out.println("El resultado es: " + operacion1);
                break;
            case 2:
                System.out.println("Escribe el primer valor de la operación");
                int c = scanner.nextInt();
                System.out.println("Escribe el segundo valor de la operacion");
                int d = scanner.nextInt();
                int operacion2 = c - d;
                System.out.println("El resultado es: " + operacion2);
                break;
            case 3 :
                System.out.println("Escribe el primer valor de la operación");
                int e = scanner.nextInt();
                System.out.println("Escribe el segundo valor de la operacion");
                int f = scanner.nextInt();
                int operacion3 = e * f;
                System.out.println("El resultado es: " + operacion3);
                break;
            case 4 :
                System.out.println("Escribe el primer valor de la operación");
                int g = scanner.nextInt();
                System.out.println("Escribe el segundo valor de la operacion");
                int h = scanner.nextInt();
                if (h != 0){
                    int operacion4 = g / h;
                    System.out.println("El resultado es: " + operacion4);
                }else {
                    System.out.println("Error: no se puede dividir entre cero");
                }
                break;
            case 5:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Operación no es válida");
                break;
        }

    }while (opcion != 5);
    scanner.close();
    }
}