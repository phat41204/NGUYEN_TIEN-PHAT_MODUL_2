package KeThua;

public class CircleAndCylinder {
    private double radius;
    private String color;

    public CircleAndCylinder(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double caculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle : [Radius: " + radius + ", Color: " + color + ",area: " + caculateArea() + "]";
    }
}

