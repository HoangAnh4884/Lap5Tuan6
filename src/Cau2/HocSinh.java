package Cau2;

public class HocSinh {
    private String hoTen ;
    private String lop ;
    double toan;
    double ly;
    double hoa;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    
    void diemTB() {
        double TB = (toan+ly+hoa)/3;
        System.out.printf("Điểm trung bình 3 môn toán lý hóa của hs là: ", TB);
    }
}

class HocSinhChuyenToan extends HocSinh {
    @Override
    void diemTB() {
        double TB = ((toan*2)+ly+hoa)/4;
        System.out.printf("Điểm trung bình 3 môn toán lý hóa của hsct là: ", TB);
    }
}

class main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.diemTB();
        
        HocSinhChuyenToan hsct1 = new HocSinhChuyenToan();
        hsct1.diemTB();
        
        return;
    }
}