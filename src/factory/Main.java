package factory;

public class Main {
    public static void main(String[] args) {

        // Getting the operationName via command line argument.
        // Assign the first argument passed in the command line argument string as operationName.
        String operationName =  args[0];

        // Creating a instance of OperationFactory
        OperationFactory operationFactory = new OperationFactory();

        // Calling the getInstance() method in operationFactory while passing the operationName as an argument.
        Operation operation = operationFactory.getInstance(operationName);
        // Performing a method from the newly created instance.
        operation.perform();
    }
}