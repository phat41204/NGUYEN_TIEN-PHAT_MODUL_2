package LamQuenVoiJava;

import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your mount in USD to VND: ");
      double usd = scanner.nextDouble();
      double VND = usd * 24.5;
      System.out.println("VND is " + VND);
      scanner.close();
    }
}
