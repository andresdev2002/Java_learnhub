//Eliminar duplicados usando HashSet
package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminarDuplicados {
    public static void main(String[] args){

        ArrayList<Integer> lista = new ArrayList<>(List.of(1,2,2,3,3,4,5,6,7,8,9));
        Set<Integer> SinDuplicados = new HashSet<>(lista);
        System.out.println("Valores sin duplicados: " + SinDuplicados);
    }
}
