//Contar frecuencia de palabras en una frase usando HashMap
package org.example;

import java.util.HashMap;
import java.util.Map;

public class FrecuenciaPalabras {
    public static void main(String[] args){
        String frase = "Java es genial y java es poderoso";
        String[] palabras = frase.split(" " );
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra : palabras){
        frecuencia.put(palabra,frecuencia.getOrDefault(palabra, 0)+1);
        }
        System.out.println(frecuencia);

    }
}
//El método put se usa para insertar o actualizar un par clave-valor en un Map como HashMap.
//frecuencia.getOrDefault(palabra, 0) busca la palabra clave en el HashMap