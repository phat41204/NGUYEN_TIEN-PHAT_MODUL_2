package array;

import java.util.Scanner;

public class TinhTongHangVaCot {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},};
        System.out.println("in mảng hiện tại");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cột bạn muốn tính tổng :   ");
        int column = scanner.nextInt();

        if (column < 0 || column >= array.length) {
            System.out.println("mảng không hợp lệ ");
        } else {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][column];
            }
            System.out.println("tổng các phần tử trong cột " + column + " là: " + sum);
        }
        scanner.close();
    }
}
