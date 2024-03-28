package factory.impl;

import factory.Operation;

public class DivOperation implements Operation {
    @Override
    public void perform() {
        System.out.println("Performing Div Operation");
    }
}
