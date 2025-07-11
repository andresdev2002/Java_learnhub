//Lee un número y di si es positivo, negativo o cer0.
package org.example;

import java.util.Scanner;

public class TipoNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el numero: ");
        int num = scanner.nextInt();

        if (num == 0){
            System.out.print("El numero es cero");
        }else if (num > 0){
            System.out.print("El numero es positivo");
        }else{
            System.out.print("El numero es negativo");
        }
        scanner.close();
    }
}
