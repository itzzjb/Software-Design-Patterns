package decorator.impl.decoratorImpl;

import decorator.Shape;
import decorator.impl.ShapeDecorator;

public class BorderDecorator extends ShapeDecorator {
    // Create a field for borderType
    private String  borderType;

    // We need to override the constructor here
    // Getting an extra parameter borderType here
    public BorderDecorator(Shape shape, String borderType) {
        // Pass the shape object to the main class constructor
        // This assigns the passed instance into the protected property called decoratedShape in the main class.
        super(shape);
        this.borderType = borderType;
    }

    // Now we can override the draw() method inorder to add a border
    @Override
    public void draw() {
        super.draw();
        // Doing the decoration
        System.out.println("Adding a " +borderType+" border to the shape.");
    }

}
