package TestModule2.Model.Entity;

public class PhoneChinhHang extends  Phone{
private int ThoiGianBaoHanh ;
private String PhamViBaoHanh ;

    public PhoneChinhHang(int id, String ten, double gia, int soLuong, String nhaSX, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, ten, gia, soLuong, nhaSX);
        ThoiGianBaoHanh = thoiGianBaoHanh;
        PhamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return ThoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        ThoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return PhamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        PhamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return super.toString()+" " +"thoi gian bao hanh: " + ThoiGianBaoHanh + " pham vi bao hanh:" + PhamViBaoHanh;
    }
}
