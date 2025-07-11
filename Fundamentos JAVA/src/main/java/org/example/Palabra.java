//Palabra secreta
package org.example;
import java.util.Scanner;
public class Palabra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una palabra: ");
        String palabra = scanner.nextLine();

        if (palabra.equals("Almas")){
            System.out.println("Acceso concedido");
        }else {
            System.out.println("Acceso denegado");
        }
        scanner.close();
    }
}
