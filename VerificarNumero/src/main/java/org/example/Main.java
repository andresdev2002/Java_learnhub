//Verificar que el número está dentro de un rango establecido
package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un número: ");
        int num = scanner.nextInt();


        boolean rango = (num >= 10 && num <= 20);
        System.out.println(rango);


    }
}