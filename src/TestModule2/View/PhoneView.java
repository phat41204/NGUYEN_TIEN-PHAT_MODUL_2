package TestModule2.View;

import TestModule2.Controller.PhoneController;

import java.util.Scanner;

public class PhoneView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();
            PhoneController phoneController = new PhoneController();
            switch (choice) {
                case 1:phoneController.addNewPhone();
                    break;
                case 2:
                    phoneController.deletphone();
                    break;
                case 3:
                    phoneController.showPhoneList();
                    break;
                case 4:
                    phoneController.searchPhone();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
            catch (Exception e) {
                System.out.println("vui lòng không để trống");
            }
        }
    }
}
