package AccessModifier;

public class BaiTapAccessModifier {
    private double Radius = 1 ;
    private String color =  "  red";

    public BaiTapAccessModifier(double radius) {
        this.Radius = radius;
    }
    public BaiTapAccessModifier() {
    }
    private double getRadius() {
        return Radius;
    }
    private double getArea(){
        return Math.PI *Radius * Radius ;
    }
     public String Display() {
        return "Radius: " + getRadius() + " Area: " + getArea();
     }
}
