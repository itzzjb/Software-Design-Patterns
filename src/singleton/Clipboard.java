package singleton;

public class Clipboard {

    // We have a private property here to have the Clipboard Instance
    // Set the default value to null.
    // The property must static because we are using it
    private static Clipboard clipboardInstance = null;

    // We need to make the constructor private to it can't be accessed from the outside.
    // But this class can access this constructor.
    private Clipboard() {
    }

    // Creating a getInstance method
    // Make the method static, so we can call the method from the Class directly

    // If you call this method for the first time, the instance property is null. So, Clipboard instance will be created and assigned to instance property.
    // After that the instance property is not null, so it will simply return the same instance again and again.
    public static Clipboard getInstance() {
        if (clipboardInstance == null) {
            // You can access the constructor inside the class
            clipboardInstance =  new Clipboard();
        }
        return clipboardInstance;
    }

    // We need a property for storing the data of clip board
    private String value;

    // We need to implement the copy() and paste() methods
    public void copy(String data) {
        this.value = data;
    }

    public String paste() {
        return this.value;
    }

}
