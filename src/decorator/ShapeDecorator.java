package decorator;

public abstract class ShapeDecorator {
    Shape shape;

    ShapeDecorator(Shape s) {
        this.shape = s;
    }

    public void draw() {
        shape.draw();
    }
}
