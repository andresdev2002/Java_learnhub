//Licencia para conducir
package org.example;
import java.util.Scanner;

public class Licencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tienes licencia de conducir (Si/No):");
        String licencia = scanner.nextLine().toLowerCase();

        if (edad >= 18 && licencia.equals("si")){
            System.out.println("Usted puede conducir");
        } else if (edad < 18) {

            System.out.println("Usted es menor de edad, no puede conducir");
        }else {
            System.out.println("Usted no tiene licencia para conducir");
        }
        scanner.close();
    }
}
