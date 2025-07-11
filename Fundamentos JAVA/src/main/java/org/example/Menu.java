//Muestra un menú simple con switch:
package org.example;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al menu de busqueda");
        System.out.println("1. Ver saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");
        System.out.println("Selecione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Tu saldo es de: 100000");
                break;
            case 2:
                System.out.println("Has retirado 50000");
                break;
            case 3:
                System.out.println("Depositaste 100000");
                break;
            case 4:
                System.out.println("Saliste de tu cuenta");
                break;
            default:
                System.out.println("Opcion invalida");
        }
        scanner.close();

    }
}
