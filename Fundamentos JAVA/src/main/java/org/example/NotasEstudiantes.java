//Guarda las notas de varios estudiantes y calcula el promedio de cada uno.
package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasEstudiantes {
    public static void main(String[] args){
        Map<String, ArrayList<Integer>> notas = new HashMap<>();

        notas.put("Ana", new ArrayList<>(List.of(4,5,6,3)));
        notas.put("Andres", new ArrayList<>(List.of(3,5,2,4)));
        notas.put("Juan", new ArrayList<>(List.of(3,4,3,5)));

        for (Map.Entry<String, ArrayList<Integer>> entry : notas.entrySet()){
            String nombre = entry.getKey();
            ArrayList<Integer> calificaciones = entry.getValue();
            double promedio = calificaciones.stream().mapToInt(i -> i). average().orElse(0);
            System.out.println(nombre + "Promedio: "+ promedio);
        }
    }
}

//stream() = convierte la lista en un flujo de datos.
//mapToInt(i -> i) = convierte cada número en un entero.
//average() = saca el promedio.
//orElse(0) = si no hay notas, devuelve 0.
