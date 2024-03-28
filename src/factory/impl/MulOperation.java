package factory.impl;

import factory.Operation;

public class MulOperation implements Operation {
    @Override
    public void perform() {
        System.out.println("Performing Mul Operation");
    }
}
