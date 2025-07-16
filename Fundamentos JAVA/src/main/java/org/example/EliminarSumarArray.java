//Eliminar duplicados y mostrar la suma de los valores únicos
package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminarSumarArray {
    public static void main(String[] args){

        ArrayList<Integer> lista = new ArrayList<>(List.of(1,2,2,3,4,4,5,6,6,7,7,8,9));
        Set<Integer> eliminarDuplicados = new HashSet<>(lista);
        int suma = 0;
        for (int num : eliminarDuplicados){
            suma += num;
        }
        System.out.println("El arreglo sin duplicados es: " + eliminarDuplicados);
     System.out.println("La suma del arreglo es: " + suma);
    }
}
