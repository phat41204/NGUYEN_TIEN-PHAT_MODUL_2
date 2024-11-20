package InterfaceAbtractclass.Bai2;

public class Square implements Colorable {


    private double side;


    public Square(double side) {
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
