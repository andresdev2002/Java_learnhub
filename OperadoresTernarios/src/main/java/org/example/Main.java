package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Escribe tú edad: ");
         int edad = scanner.nextInt();

         String resultado = ( edad >= 18)? "Mayor" : "Menor";
         System.out.println(resultado);


    }
}