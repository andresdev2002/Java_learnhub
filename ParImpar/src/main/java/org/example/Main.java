//El siguiente programa nos va permitir identificar si un número es par o impar
package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Escribe un número: ");
            int num = scanner.nextInt();

            if (num % 2 == 0){
                System.out.println("El número " + num + " es un número par ");
            }else{
                System.out.println("El número " + num + " es impar");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: el valor que enviaste es incorrecto");
        }


    }
}