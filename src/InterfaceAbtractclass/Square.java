package InterfaceAbtractclass;

public class Square implements Resizeable {
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
    public void resize(double percent) {
        this.side = this.side * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
