package KeThua;

public class Cylinder extends CircleAndCylinder {
    private double height;

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double caculateVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {

        return super.toString() + ", Height: " + height + ", Volume: " + caculateVolume() + "]";
    }
}
