package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CanalYouTube canal = new CanalYouTube();

        Observador sus1 = new Suscriptor("Andres");
        Observador sus2 = new Suscriptor("Maria");
        Observador sus3 = new Suscriptor("Carlos");

        canal.agregarObservador(sus1);
        canal.agregarObservador(sus2);
        canal.agregarObservador(sus3);

        canal.subirVideo("Patrón observer en Java");
        System.out.println();

        canal.eliminarObservador(sus2);
        canal.subirVideo("Curso de programación orientada a objetos");
    }
}