package factory;

// We need to extend this class from the RuntimeException class
public class OperationNotFoundException extends RuntimeException {
    // We are changing the constructor of this Exception.
    // This will override the default constructor too.
    public OperationNotFoundException(String message) {
        // We need to pass the message to the RuntimeException class constructor.
        super(message);
    }
}
