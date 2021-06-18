package decorator;

/*
It allows to add new functionality to an existing object without altering its structure
This pattern creates a decorator class which wraps the original class and
provides additional functionality keeping class methods signature intact.
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();

        RedShapeDecorator obj = new RedShapeDecorator(circle);
        obj.draw();

        RedShapeDecorator obj2 = new RedShapeDecorator(rect);
        obj2.draw();
    }
}
