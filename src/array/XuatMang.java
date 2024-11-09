package array;

import java.util.Scanner;

public class XuatMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng hàng");
        int row = scanner.nextInt();
        System.out.println("nhập số luọng cột ");
        int column = scanner.nextInt();

        double[][] array = new double[row][column];

        System.out.println("nhập các phần tử của mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("nhập giá trị cho phần tử tại cột [" + i + "][" + j + "]");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println(" mảng bạn đã nhập là ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}


