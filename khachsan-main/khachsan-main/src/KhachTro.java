public class KhachTro {
    private Nguoi nguoi_2138;
    private int soNgayTro_2138;
    private String loaiPhong_2138;
    private double giaPhong_2138;

    public KhachTro(Nguoi nguoi_2138, int soNgayTro_2138, String loaiPhong_2138, double giaPhong_2138) {
        this.nguoi_2138 = nguoi_2138;
        this.soNgayTro_2138 = soNgayTro_2138;
        this.loaiPhong_2138 = loaiPhong_2138;
        this.giaPhong_2138 = giaPhong_2138;
    }

    public String getSoCMND_2138() {
        return nguoi_2138.getSoCMND_2138();
    }

    public double tinhTien_2138() {
        return soNgayTro_2138 * giaPhong_2138;
    }

    public void hienThiThongTin_2138() {
        nguoi_2138.hienThiThongTin_2138();
        System.out.printf("Loại phòng: %s, Giá phòng: %.2f, Số ngày trọ: %d%n",
                loaiPhong_2138, giaPhong_2138, soNgayTro_2138);
    }
}