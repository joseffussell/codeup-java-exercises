package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle myShape = new Rectangle(2, 4);
        Measureable myShape2 = new Square(4);
        Measureable myshape3 = new Square( 5);
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myshape3.getPerimeter());
        System.out.println(myshape3.getArea());
    }
}