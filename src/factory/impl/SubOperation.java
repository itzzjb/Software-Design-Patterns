package factory.impl;

import factory.Operation;

public class SubOperation implements Operation {
    @Override
    public void perform() {
        System.out.println("Performing Sub Operation");
    }
}
