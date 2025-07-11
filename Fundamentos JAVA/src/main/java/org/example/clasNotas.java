//Solicita una nota (0 a 10) y muestra el mensaje correspondiente:
package org.example;
import java.util.Scanner;
public class clasNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Binvenido al sistema de notas");
        System.out.println("Escriba su calificación: ");
        int nota = scanner.nextInt();

        if (nota <= 5){
            System.out.println(" Usted reprobo la materia ");
        } else if (nota >= 6 && nota <= 7) {
            
            System.out.print("Usted aprobo la materia ");
        } else if (nota >= 8 && nota <= 10) {

            System.out.print("Usted aprobo la materia con una excelente calificación");
        }
        scanner.close();


    }  
}
