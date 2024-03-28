package decorator.impl;

import decorator.Shape;

// Notice that this ShapeDecorator class is implemented by Shape interface.
// We can make this an Abstract class because we don't need to crete objects from ShapeDecorator directly.
public abstract class ShapeDecorator implements Shape {

    // We need to have Shape property here.
    private Shape decoratedShape;

    // We need to have a constructor in order to get a shape instance as an argument.
    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        // We need to just call the draw method of the shape here
        decoratedShape.draw();
    }
}
