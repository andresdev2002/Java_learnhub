//Desarrolla un programa que indique si una persona puede ser beneficiaria
//de un crédito bancario
//Personas con sueldos mayores a 2000000 y edad 30 puden acceder a los creditos
//Personas con sueldos mayores o igual a 1500000 edad 18
package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Ingresa tú edad: ");
         int edad = scanner.nextInt();

        System.out.println("Ingeresa tu sueldo: ");
        double sueldo = scanner.nextDouble();

        boolean puedeCredito = (edad >= 18 && edad < 30 && sueldo >= 1500000)||(edad >= 30 && sueldo >= 2000000);
        System.out.println(puedeCredito);


    }
}