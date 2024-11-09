package LamQuenVoiJava;

import java.util.Scanner;

public class read_bai2345 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("vui lòng nhập số bạn muốn đọc: ");
    int number = scanner.nextInt();
     if (number >= 0 && number < 10) {
         switch (number) {
             case 0 :
                 System.out.println("không");
                 break;
             case 1 :
                     System.out.println("một");
                     break;
             case 2 :
                 System.out.println("hai");
                 break;
             case 3 :
                 System.out.println("ba");
                 break;
             case 4 :
                 System.out.println("bốn");
                 break;
             case 5 :
                 System.out.println("năm");
                 break;
             case 6 :
                 System.out.println("sáu");
                 break;
             case 7 :
                 System.out.println("bảy");
                 break;
             case 8 :
                 System.out.println("tám");
                 break;
             case 9 :
                 System.out.println("chín");
                 break;

         }
     }else if (number >= 10 && number <20) {
         int ones = number % 10;
         switch (ones) {
             case 0 : System.out.println("mười");break;
             case 1 : System.out.println("mười một");break;
             case 2 : System.out.println("mười hai");break;
             case 3 : System.out.println("mười ba");break;
             case 4 : System.out.println("mười bốn ");break;
             case 5 : System.out.println("mười năm");break;
             case 6 : System.out.println("mười sáu ");break;
             case 7 : System.out.println("mười bảy");break;
             case 8 : System.out.println("mười tám");break;
             case 9 : System.out.println("mười chín");break;
             default : break;

     }

     }else {
     System.out.println("số bạn nhập không trong phạm vi đọc của ứng dụng ");

     }
     scanner.close();
     }


}

