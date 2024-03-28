package decorator.impl.decoratorImpl;

import decorator.Shape;
import decorator.impl.ShapeDecorator;

public class ColorDecorator extends ShapeDecorator {
    // Create a field for color
    private String  color;

    // We need to override the constructor here
    // Getting an extra parameter color here
    public ColorDecorator(Shape shape, String color) {
        // Pass the shape object to the main class constructor
        // This assigns the passed instance into the protected property called decoratedShape in the main class.
        super(shape);
        // Assigning the value to the color property.
        this.color = color;
    }

    // Now we can override the draw() method inorder to add the color
    @Override
    public void draw() {
        super.draw();
        // Doing the decoration
        System.out.println("Adding " + color + " to the shape.");
    }
}
