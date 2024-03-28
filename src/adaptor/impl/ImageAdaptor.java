package adaptor.impl;

import adaptor.imageViewerExternal.ImageViewer;
import adaptor.MediaPlayer;

public class ImageAdaptor implements MediaPlayer {

    // Creating a property of ImageViewer
    // So we can use this as a generic ImageAdaptor to support both "jpeg" and "png"
    // by doing conversions with both JpegImageViewer and PngImageViewer
    private ImageViewer imageViewer;

    // Getting a instance of ImageViewer through the constructor
    public ImageAdaptor(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    @Override
    public void play(String filePath) {
        // This is where the conversion happens. play() -> show()
        imageViewer.show(filePath);
    }

}
