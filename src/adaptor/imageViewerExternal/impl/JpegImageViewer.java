package adaptor.imageViewerExternal.impl;

import adaptor.imageViewerExternal.ImageViewer;

public class JpegImageViewer implements ImageViewer {

    @Override
    public void show(String filePath) {
        System.out.println("Playing a JPEG: " + filePath);
    }
}
