
package shapes;

public class Square extends Quadrilateral{

    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(int length) {
        this.side = length;
        ;
    }

    @Override
    public void setWidth(int width) {
        this.side = width;

    }
}