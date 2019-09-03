package zx.learn.factory;



public class SimpleShapeFactory {

    public static void main(String[] args) {

        Shape shape = SimpleShapeFactory.getShape("circle");
        shape.draw();
    }



    public static final String TAG = "ShapeFactory";

    public static Shape getShape(String type) {
        Shape shape = null;
        if (type.equalsIgnoreCase("circle")) {
            shape = new CircleShape();
        } else if (type.equalsIgnoreCase("rect")) {
            shape = new RectShape();
        } else if (type.equalsIgnoreCase("triangle")) {
            shape = new TriangleShape();
        }
        return shape;
    }
}

interface Shape {
    void draw();
}

class CircleShape implements Shape {

    public CircleShape() {
        System.out.println("CircleShape: created");
    }

    public void draw() {
        System.out.println("draw: CircleShape");
    }

}

class RectShape implements Shape {
    public RectShape() {
        System.out.println("RectShape: created");
    }

    public void draw() {
        System.out.println("draw: RectShape");
    }

}

class TriangleShape implements Shape {

    public TriangleShape() {
        System.out.println("TriangleShape: created");
    }

    public void draw() {
        System.out.println("draw: TriangleShape");
    }

}