package org.example;

public class CompresionZip implements EstrategiaCompresion {
    @Override
    public void comprimir(String formato){
        System.out.println("Comprimiendo el formato " + formato);
    }
}