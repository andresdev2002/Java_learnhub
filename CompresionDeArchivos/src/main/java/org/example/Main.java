package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Compresor compresor = new Compresor();

        compresor.setEstrategiaCompresion(new Compresion7z());
        compresor.comprimir("El archivo se comprimio correctamente a 7z");

        compresor.setEstrategiaCompresion(new CompresionRar());
        compresor.comprimir(" El archivo se comprimio correctamente a Rar");

        compresor.setEstrategiaCompresion(new CompresionZip());
        compresor.comprimir("El archivo se comprimio correctamente a Zip");
    }
}