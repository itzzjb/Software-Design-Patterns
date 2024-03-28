package decorator.impl;

import decorator.Shape;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle.");
    }
}
