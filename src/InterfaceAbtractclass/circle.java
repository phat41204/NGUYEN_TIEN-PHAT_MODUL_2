package InterfaceAbtractclass;

import java.awt.*;

public class circle implements Resizeable {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
