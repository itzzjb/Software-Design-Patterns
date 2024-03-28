package factory;

public class Main {
    public static void main(String[] args) {

        // Getting the operationName via command line argument.
        // Assign the first argument passed in the command line argument string as operationName.
        String operationName =  args[0];

        // Calling the getInstance() static method in OperationFactory while passing the operationName as an argument.
        Operation operation = OperationFactory.getInstance(operationName);

        // Performing a method from the newly created instance.
        operation.perform();

    }
}