package adaptor.ImageViewerExternal.impl;

import adaptor.ImageViewerExternal.ImageViewer;

public class PngImageViewer implements ImageViewer {

    @Override
    public void show(String filePath) {
        System.out.println("Playing a PNG: " + filePath);
    }
}
