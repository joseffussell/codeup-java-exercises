package shapes;



public class Rectangle extends Quadrilateral implements Measureable {

    public Rectangle(int length, int width) {
        super(length, width);

    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (length * 2);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}