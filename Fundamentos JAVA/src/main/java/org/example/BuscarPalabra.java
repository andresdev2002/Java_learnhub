//Buscar una palabra en la lista
package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscarPalabra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>(List.of("Hola", "Secreto", "Mundo", "Código"));

        System.out.println("Busca la palabra: ");
        String buscar = scanner.next();

        boolean encontrada = false;

        for (String palabra : palabras){
            if (palabra.equalsIgnoreCase(buscar)){/// Comparación sin importar mayúsculas/minúsculas
                encontrada = true;
                break;
            }
        }
        if (encontrada){
            System.out.println("La palabra" + buscar + "Esta en la lista");
        }else {
            System.out.println("La palabra" + buscar + "no esta en la lista");
        }

        scanner.close();

    }
}
//equalsIgnoreCase(...) compara sin importar si hay mayúsculas o minúsculas.