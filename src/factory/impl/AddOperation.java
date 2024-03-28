package factory.impl;

import factory.Operation;

public class AddOperation implements Operation {
    @Override
    public void perform() {
        System.out.println("Performing Add Operation");
    }
}
