package KeThua;

import java.awt.*;

public class Point3D extends Point2D {
    private float z ;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        this.z = 0.0F;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void getxyz(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
     public float[] getxyz(){
        return new float[]{this.getX(), this.getY(), this.getZ()};
    }
    @Override
    public String toString() {
      float[] xy = getxy();
      return "Point3D [x=" + xy[0] + ", y=" + xy[1] + ", z=" + z + "]";
    }
}
