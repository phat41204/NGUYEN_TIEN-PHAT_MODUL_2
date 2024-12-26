package TestModule2.Model.Repository;

import TestModule2.Model.Entity.Phone;
import TestModule2.Model.Entity.PhoneChinhHang;
import TestModule2.Model.Entity.PhoneXachTay;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {
    private static final String File = "src/TestModule2/Data/Mobiles.csv";
    private List<Phone> PhoneList;

    public PhoneRepository() {
        PhoneList = new ArrayList<>();
        DocDuLieuCuaFile();
    }

    private void DocDuLieuCuaFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(File))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Phone phone = PhoneCreate(data);
                if (phone != null) {
                    PhoneList.add(phone);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(" loidocDuLieuCuaFile");;
        } catch (IOException e) {
            System.out.println("loidocDuLieuCuaFile");;
        }
    }
    private Phone PhoneCreate(String [] fields) {
        int id = Integer.parseInt(fields[0].trim());
        String ten = fields[1].trim();
        Double gia = Double.parseDouble(fields[2].trim());
        int soluong = Integer.parseInt(fields[3].trim());
        String nhaSX = fields[4].trim();
        if (fields[5].matches("\\d+")) {
            int ThoiGianbaoHanh = Integer.parseInt(fields[5].trim());
            String PhamViBaoHanh = fields[6].trim();
            return new PhoneChinhHang(id,ten,gia,soluong,nhaSX,ThoiGianbaoHanh,PhamViBaoHanh);
        }else {
            String QuocGiaXachTay = fields[5].trim();
            String TrangThai = fields[6].trim();
            return new PhoneXachTay(id,ten,gia,soluong,nhaSX,QuocGiaXachTay,TrangThai);

        }
    }
    public void addPhone(Phone phone) {
        PhoneList.add(phone);
    }
    public void savetofile(){
        try (BufferedWriter Bw = new BufferedWriter(new FileWriter(File))){
            Bw.write(PhoneList.toString());
            Bw.newLine();
        } catch (IOException e) {
            System.out.println("loi Luu File");;
        }
    }
    public List<Phone> getPhoneList() {
        return PhoneList;
    }
    public List<Phone> Search(String word){
        List<Phone> searchList = new ArrayList<>();
        for (Phone phone : PhoneList) {
            if (phone.getId()==Integer.parseInt(word.trim())|| phone.getTen().toLowerCase().contains(word.trim().toLowerCase())) {
                searchList.add(phone);
            }
        }
        return searchList;
    }
    public boolean removePhone(int id) {
        for (Phone phone : PhoneList) {
            if (phone.getId()==id) {
                PhoneList.remove(phone);
                savetofile();
                return true;
            }
        }
        return false;
    }
}

