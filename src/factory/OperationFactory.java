package factory;

import factory.impl.AddOperation;
import factory.impl.DivOperation;
import factory.impl.MulOperation;
import factory.impl.SubOperation;

public class OperationFactory {

    // The method is also known as getInstance() similar to singleton pattern.
    // We are getting a String as an argument to this method. So, we can use switch statement.
    public static Operation getInstance(String operationName) {

        // Creating a local variable of Operation and assign it to null
        Operation operation =  null;

        // Using String class method .equals() which return a boolean value
        // According to the boolean value we return instances of different classes in the same class family.
        if(operationName.equals("add")) {
            operation =  new AddOperation();
        } else if (operationName.equals("sub")) {
            operation =  new SubOperation();
        } else if (operationName.equals("mul")) {
            operation =  new MulOperation();
        } else if (operationName.equals("div")) {
            operation =  new DivOperation();
        } else {
            // Throwing a OperationNotFoundException in cases where the operationName is not acceptable.
            // This also terminates the operation form here and throws the Exception.
            throw new OperationNotFoundException("Couldn't find the operation " + operationName);
        }

        // Returns the newly created instance if no exception occurs.
        return operation;

        }
}

