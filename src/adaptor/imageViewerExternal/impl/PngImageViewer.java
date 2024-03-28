package adaptor.imageViewerExternal.impl;

import adaptor.imageViewerExternal.ImageViewer;

public class PngImageViewer implements ImageViewer {

    @Override
    public void show(String filePath) {
        System.out.println("Playing a PNG: " + filePath);
    }
}
