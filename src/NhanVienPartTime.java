public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(int gioLamViec, String ten) {
        this.gioLamViec = gioLamViec;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
    
    String loaiNhanVien;
    @Override
    void tinhLuong() {System.out.println(" ");}
}
