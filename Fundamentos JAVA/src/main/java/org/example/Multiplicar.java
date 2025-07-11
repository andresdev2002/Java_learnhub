//Tabla de multiplicar
package org.example;
import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(num + "x" + i + "=" + (num * i));


        }
        scanner.close();
    }
}
