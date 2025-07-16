//Ordenar una lista de cadenas
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {
    public static void main(String[] args){
        ArrayList<String> palabras = new ArrayList<>(List.of("Código", "Bucles", "Operadores", "Datos", "Arrays"));
        Collections.sort(palabras);//Ordena alfabéticamente una lista de arreglos.
        System.out.println("La lista de cadenas es: " + palabras);
    }

}
