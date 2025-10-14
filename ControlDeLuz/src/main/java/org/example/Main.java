//Ejercicio que resalta el patron de diseño Command
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Luz luz = new Luz();

        Command encender = new EncenderLuzCommand(luz);
        Command apagar = new ApagarLuzCommand(luz);

        ControlRemoto control = new ControlRemoto();

        control.setCommand(encender);
        control.presionarBoton();

        control.setCommand(apagar);
        control.presionarBoton();
    }
}