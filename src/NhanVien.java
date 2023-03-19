public class NhanVien {
    private String ten;
    private long luong;

    public NhanVien() {
    }

    public NhanVien(String ten, long luong) {
        this.ten = ten;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
        
    String loaiNhanVien;
    void tinhLuong() {System.out.println(" ");}
}