package org.example;
import java.util.Scanner;

public class numMayor {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.print("Escriba el primer número: ");
        int numero1 = scanner.nextInt();
      System.out.print("Escriba el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Escriba el tercer número: ");
            int numero3 = scanner.nextInt();

            if (numero1 == numero2 && numero1 == numero3){
              System.out.print("Los tres numeros son iguales");
            } else if (numero1 > numero2 && numero1 > numero3){
            System.out.print(numero1 + " es mayor");
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.print(numero2 + " es mayor");
        }else{
            System.out.print(numero3 + " es mayor");
        }
        scanner.close();
    }
}
