package factory;

import factory.impl.AddOperation;
import factory.impl.DivOperation;
import factory.impl.MulOperation;
import factory.impl.SubOperation;

public class OperationFactory {

    // The method is also known as getInstance() similar to singleton pattern.
    // We are getting a String as an argument to this method. So, we can use switch statement.
    public Operation getInstance(String operationName) {

        // Using String class method .equals() which return a boolean value
        // According to the boolean value we return instances of different classes in the same class family.
        // Returns the newly created instance if no exception occurs.
        return switch (operationName) {
            case "add" -> new AddOperation();
            case "sub" -> new SubOperation();
            case "mul" -> new MulOperation();
            case "div" -> new DivOperation();
            default ->
                // Throwing a OperationNotFoundException in cases where the operationName is not acceptable.
                // This also terminates the operation form here and throws the Exception.
                    throw new OperationNotFoundException("Couldn't find the operation " + operationName);
        };
    }

}
