package zx.learn.principle.ocp.improve;

/**
 * Created with IntelliJ IDEA.
 * User: zx
 * Date: 2019/9/2
 * Time: 14:39
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Circle());
        graphEditor.drawShape(new Triangle());
        graphEditor.drawShape(new Rectangle());
    }

}
 abstract class Shape{
    int m_type;

     public abstract void draw();
 }


class GraphEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}


class Rectangle extends Shape {

    public Rectangle() {
        m_type = 1;
    }

    public void draw() {
        System.out.println("绘制正方形。。。");
    }
}

class Circle extends Shape {

    public Circle() {
        m_type = 2;
    }

    public void draw() {
        System.out.println("绘制圆形。。。");
    }
}


class Triangle extends Shape {

    public Triangle() {
        m_type = 3;
    }

    public void draw() {
        System.out.println("绘制三角形。。。");
    }
}
