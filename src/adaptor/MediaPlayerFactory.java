package adaptor;

import adaptor.imageViewerExternal.impl.JpegImageViewer;
import adaptor.imageViewerExternal.impl.PngImageViewer;
import adaptor.impl.ImageAdaptor;
import adaptor.impl.MP3MediaPlayer;
import adaptor.impl.MP4MediaPlayer;

public class MediaPlayerFactory {
    // This is the factory design type.
    public static MediaPlayer getInstance(String filePath) {

        // Creating a local variable of MediaPlayer and assign it to null
        MediaPlayer mediaPlayer = null;

        // We can use String method .endsWith("") here.
        // According to the boolean value we return instances of different classes in the same class family.
        if(filePath.endsWith(".mp3")) {
            mediaPlayer = new MP3MediaPlayer();
        } else if (filePath.endsWith(".mp4")) {
            mediaPlayer =  new MP4MediaPlayer();
        } else if (filePath.endsWith(".jpeg")) {
            // We need to pass a new JpegImageViewer instance while instantiating JpegAdaptor.
            mediaPlayer =  new ImageAdaptor(new JpegImageViewer());
        } else if (filePath.endsWith(".png")) {
            // We need to pass a new JpegImageViewer instance while instantiating JpegAdaptor.
            mediaPlayer = new ImageAdaptor(new PngImageViewer());
        } else {
            // We are doing this inorder to resolve the Null Pointer Exception
            // Throwing a InvalidFileTypeException if the file path we entered doesn't end with .mp3 or .mp4
            throw new InvalidFileTypeException("The filePath  " + filePath + " is Not Valid.");
        }

        // Returns the newly created instance if no exception occurs.
        return mediaPlayer;
    }

}
