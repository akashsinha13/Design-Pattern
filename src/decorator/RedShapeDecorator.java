package decorator;

public class RedShapeDecorator extends ShapeDecorator {
    RedShapeDecorator(Shape s) {
        super(s);
    }

    public void draw() {
        super.draw();
        addRedBorder();
    }

    public void addRedBorder() {
        System.out.println("Add red border");
    }
}
