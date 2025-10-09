package org.example;

public class Compresor {
    private EstrategiaCompresion estrategiaCompresion;

    public void setEstrategiaCompresion(EstrategiaCompresion estrategiaCompresion){
        this.estrategiaCompresion = estrategiaCompresion;
    }

    public void comprimir(String archivo){
        if (estrategiaCompresion == null){
            System.out.println("No existe ningún formato");
        }else {
            estrategiaCompresion.comprimir(archivo);
        }
    }
}
