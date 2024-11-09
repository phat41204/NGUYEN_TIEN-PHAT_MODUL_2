package array;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        String Chuoi = " hello,welcome to Việt Nam";
        System.out.println(Chuoi);
        Scanner scaner = new Scanner(System.in);
        System.out.println(" nhập môt tử mà bạn muốn biêt số lần nó xuất hiện ");
        char KyTu = scaner.next().charAt(0);
         int Dem= 0;
         for (int i = 0; i < Chuoi.length(); i++) {
             if(Chuoi.charAt(i) == KyTu){
                 Dem++;
             }
         }
         System.out.println(" số lần ký tự "+KyTu+ " xuất hiện trong chuổi là :" +  Dem);
         scaner.close();
    }
}
