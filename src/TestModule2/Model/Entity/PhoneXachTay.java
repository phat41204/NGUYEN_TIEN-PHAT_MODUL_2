package TestModule2.Model.Entity;

public class PhoneXachTay extends Phone{
    private String QuocGiaXachTay ;
    private String TrangThai;

    public PhoneXachTay(int id, String ten, double gia, int soLuong, String nhaSX, String quocGiaXachTay, String trangThai) {
        super(id, ten, gia, soLuong, nhaSX);
        QuocGiaXachTay = quocGiaXachTay;
        TrangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return QuocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        QuocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    @Override
    public String toString() {
        return  super.toString()+" "+ "PhoneXachTay{" +
                "QuocGiaXachTay='" + QuocGiaXachTay + '\'' +
                ", TrangThai='" + TrangThai + '\'' +
                '}';
    }
}
