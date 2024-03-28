package decorator;

import decorator.impl.Circle;
import decorator.impl.Rectangle;
import decorator.impl.Triangle;
import decorator.impl.decoratorImpl.BorderDecorator;
import decorator.impl.decoratorImpl.ColorDecorator;

public class Main {
    public static void main(String[] args) {

        Shape  circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        // We can pass parameters for different decorators of same type inorder to minimize the number of classes we need to create.
        Shape rectangleWithBorder = new BorderDecorator(rectangle,"Solid");
        rectangleWithBorder.draw();

        Shape triangle = new Triangle();
        // We can pass parameters for different decorators of same type inorder to minimize the number of classes we need to create.
        Shape triangleWithBorder = new BorderDecorator(triangle,"Dotted");
        // We can pass parameters for different decorators of same type inorder to minimize the number of classes we need to create.
        Shape triangleWithBorderAndColor = new ColorDecorator(triangleWithBorder,"Yellow");
        triangleWithBorderAndColor.draw();

        // Note that if we want to create a new shape we just need to create a class for that shape.
        // We have decorators that can be used with any shape.

    }
}