package org.example;

public class ControlRemoto {
    private Command comando;

    public void setCommand(Command comando){
        this.comando = comando;
    }

    public void presionarBoton(){
        comando.execute();
    }
}
