public class NhanVienFullTime extends NhanVien {
        private int loaiChucVu;
        private int ngayLamThem;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(int loaiChucVu, int ngayLamThem, String ten, long luong) {
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
    
    String loaiNhanVien;
    @Override
    void tinhLuong() {System.out.println(" "); 
    }
}