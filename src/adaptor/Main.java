package adaptor;

public class Main {
    public static void main(String[] args) {

        // We are getting the file path as an command-line argument,
        // Assign the first argument passed in the command line argument string as filaPath.
        String filePath =  args[0];

        // Calling the getInstance() static method in MediaPlayerFactory while passing filePath as an argument.
        MediaPlayer mediaPlayer = MediaPlayerFactory.getInstance(filePath);

        // Performing a method from the newly created instance.
        mediaPlayer.play(filePath);

    }

}