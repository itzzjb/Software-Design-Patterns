package adaptor.imageViewerExternal;

// Consider this as a external library that was written by somebody else.
// ImageViewer interface is not compatible with MediaPlayer interface.
// So, we need a Adaptor.
public interface ImageViewer {
    void show(String filePath);
}
