package adaptor.impl;

import adaptor.MediaPlayer;

public class MP3MediaPlayer implements MediaPlayer {
    @Override
    public void play(String filePath) {
        System.out.println("Playing a MP3: " + filePath);
    }
}
