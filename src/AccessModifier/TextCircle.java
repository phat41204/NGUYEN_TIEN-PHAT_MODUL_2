package AccessModifier;

public class TextCircle {
    public static void main(String[] args) {
        BaiTapAccessModifier Circle = new BaiTapAccessModifier();

        System.out.println("Raidius"+ Circle.Display());

        BaiTapAccessModifier Circle2 = new BaiTapAccessModifier(5.0);
        System.out.println("Raidius"+ Circle2.Display());
    }
}
