import java.util.Scanner;

public class TinhPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("get a value for a ");
        double a = sc.nextDouble();
        System.out.println("get a value for b ");
        double b = sc.nextDouble();
        System.out.println("get a value for c ");
        double c = sc.nextDouble();

        PhuongTrinhBacHai equation = new PhuongTrinhBacHai(a, b, c);

        double detal = equation.getDiscriminant();
        System.out.println("value of detal is " + detal);
    if (detal > 0 ){
        System.out.println("detal have two value diffirence :");
        System.out.println("value 1 of detal is" + equation.getRoot1());
        System.out.println("value 2 of detal is" + equation.getRoot2());
    }else if (detal == 0 ){
        System.out.println("detal have one value diffirence :" +equation.getRoot1());
    }else {
        System.out.println("detal don't have any one value");
    }
    }

}
