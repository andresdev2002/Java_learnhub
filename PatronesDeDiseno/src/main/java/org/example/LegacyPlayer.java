//Patron de diseño adapter
package org.example;

//Interfaz esperada
interface MediaPlayer{
    void play (String filename);
}
//Clase existente incompatible
public class LegacyPlayer {
    public void playFile(String file){
        System.out.print("Playing file: " + file);
    }
//Prueba
    public static void main(String[] args){
        MediaPlayer player = new MediaAdapter(new LegacyPlayer());
        player.play("song.mp3 ");
    }

}

//Adaptador
 class MediaAdapter implements MediaPlayer{
    private LegacyPlayer legacyPlayer;

    public MediaAdapter(LegacyPlayer legacyPlayer){
        this.legacyPlayer = legacyPlayer;
    }
    @Override
    public void play (String filename){
        legacyPlayer.playFile(filename);
    }
}
//Adapter permite que clases con interfaces incompatibles trabajen juntas