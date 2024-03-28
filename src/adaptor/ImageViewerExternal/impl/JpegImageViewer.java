package adaptor.ImageViewerExternal.impl;

import adaptor.ImageViewerExternal.ImageViewer;

public class JpegImageViewer implements ImageViewer {

    @Override
    public void show(String filePath) {
        System.out.println("Playing a JPEG: " + filePath);
    }
}
