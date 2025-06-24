package org.example;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Crear lector

        System.out.print("Ingresar número: ");
            int numero = scanner.nextInt();//Guardamos el número ingresado

        if (numero % 2 == 0){//Si el resto de dividir por dos es cero
            System.out.print("El número es par");
        }else {
            System.out.print("El número es impar");
        }

        scanner.close();//Cerramos el scanner
    }

}
 //El System.in Representa la entrada de datos desde el teclado, es decir, lo que el usuario escribe en la consola.