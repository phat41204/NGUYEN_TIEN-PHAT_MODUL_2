package TestModule2.Controller;

import TestModule2.Model.Entity.Phone;
import TestModule2.Model.Entity.PhoneChinhHang;
import TestModule2.Model.Entity.PhoneXachTay;
import TestModule2.Model.Service.PhoneService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PhoneController {
    private PhoneService phoneService = new PhoneService();
    private Scanner scanner = new Scanner(System.in);
    public void addNewPhone() {
        System.out.println("Nhập thông tin điện thoại mới:");

        System.out.print("Tên điện thoại: ");
        String ten = scanner.nextLine();

        System.out.print("Giá bán: ");
        double gia = Double.parseDouble(scanner.nextLine());

        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhà sản xuất: ");
        String nhaSX = scanner.nextLine();


        System.out.print("Chọn loại điện thoại (1: Chính Hãng, 2: Xách Tay): ");
        int loai = Integer.parseInt(scanner.nextLine());
        Phone phone = null;
        if (loai == 1) {
            System.out.println("Thời gian bảo hành (ngày):");
            int thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
            System.out.print("Phạm vi bảo hành (Toan Quoc / Quoc Te): ");
            String phamViBaoHanh = scanner.nextLine();
            if (thoiGianBaoHanh <= 0 || thoiGianBaoHanh >730){
                System.out.println("Thời gian bảo hành không hợp lệ!");
                return;
            }if (!phamViBaoHanh.equals("Toan Quoc") && !phamViBaoHanh.equals("Quoc Te")){
                System.out.println("Phạm vi bảo hành chỉ có giá trị 'Toan Quoc' hoặc 'Quoc Te'.");
                return;
            }
            phone = new PhoneChinhHang(0, ten, gia, soLuong, nhaSX, thoiGianBaoHanh, phamViBaoHanh);
        }if (loai == 2){
            System.out.print("Nhập quốc gia xách tay: ");
            String quocGiaXachTay = scanner.nextLine();
            System.out.print("Nhập trạng thái (Da sua chua/Chua sua chua): ");
            String trangThai = scanner.nextLine();
        phone = new PhoneXachTay(0,ten,gia,soLuong,nhaSX,quocGiaXachTay,trangThai);
        }
        if (phone !=null){
            phoneService.savephone(phone);
            System.out.println("Thêm điện thoại thành công!");

        }
    }

    public void deletphone(){
        System.out.print("Nhập ID điện thoại muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        phoneService.deletephoneById(id);
        System.out.println("Xóa điện thoại thành công.");
    }
    public void showPhoneList(){
        List<Phone> PhoneList = phoneService.getAllphones();
        for( Phone phone :PhoneList){
            System.out.println(phone);
        }
    }
    public void searchPhone() {
        System.out.print("Nhập từ khóa tìm kiếm (ID hoặc tên): ");
        String keyword = scanner.nextLine();
        List<Phone> result = phoneService.getlphonesByName(keyword);
        for (Phone phone : result) {
            System.out.println(phone);
        }
    }

}


