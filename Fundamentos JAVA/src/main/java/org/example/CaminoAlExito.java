package org.example;

public class CaminoAlExito {

    public static void main(String[] args) {
        String[] pasos = {
                "Aprender lo básico",
                "Practicar todos los días",
                "Fallé pero aprendí",
                "Volví a intentarlo",
                "Resistí la duda",
                "Avancé paso a paso",
                "No me rendí",
                "Lo logré"
        };

        for (int i = 0; i < pasos.length; i++) {
            motivar(pasos[i], i + 1);
        }

        System.out.println("\nEl éxito no es magia, es constancia.");
    }

    public static void motivar(String paso, int dia) {
        System.out.println("Día " + dia + ": " + paso);
    }
}






