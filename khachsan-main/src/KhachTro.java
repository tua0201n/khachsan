public class KhachTro {
    private Nguoi nguoi_141;
    private int soNgayTro_141;
    private String loaiPhong_141;
    private double giaPhong_141;

    public KhachTro(Nguoi nguoi_141, int soNgayTro_141, String loaiPhong_141, double giaPhong_141) {
        this.nguoi_141 = nguoi_141;
        this.soNgayTro_141 = soNgayTro_141;
        this.loaiPhong_141 = loaiPhong_141;
        this.giaPhong_141 = giaPhong_141;
    }

    public String getSoCMND_141() {
        return nguoi_141.getSoCMND_141();
    }

    public double tinhTien_141() {
        return soNgayTro_141 * giaPhong_141;
    }

    public void hienThiThongTin_141() {
        nguoi_141.hienThiThongTin_141();
        System.out.printf("Loại phòng: %s, Giá phòng: %.2f, Số ngày trọ: %d%n",
                loaiPhong_141, giaPhong_141, soNgayTro_141);
    }
}

