public class Fan {
    final private byte Slow = 1;
    final private byte Medium = 1;
    final private byte Fast = 1;
    private int speed = Slow;
    private boolean on = false;
    private double Radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public byte getSlow() {
        return Slow;
    }

    public byte getMedium() {
        return Medium;
    }

    public byte getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on) {
            return "Fan is on with speed: " + speed + " and color: " + color + ", and radius: " + Radius;
        }else {
            return "Fan is off with color " + color + ", and radius: " + Radius;
        }
    }
}
