package adaptor.impl;

import adaptor.MediaPlayer;

public class MP4MediaPlayer implements MediaPlayer {
    @Override
    public void play(String filePath) {
        System.out.println("Playing a MP4: " + filePath);
    }
}
