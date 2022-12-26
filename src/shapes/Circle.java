package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        System.out.println(Math.PI * (Math.pow(this.radius, 2)));
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference() {
        System.out.println(2 * Math.PI * this.radius);
        return 2 * Math.PI * this.radius;
    }


    public static void main(String[] args) {
        Circle circles = new Circle(4.0);
        circles.getArea();
        circles.getCircumference();
    }
}