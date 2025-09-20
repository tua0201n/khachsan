public class Nguoi {
    private String hoTen_141;
    private String ngaySinh_141;
    private String soCMND_141;

    public Nguoi(String hoTen_141, String ngaySinh_141, String soCMND_141) {
        this.hoTen_141 = hoTen_141;
        this.ngaySinh_141 = ngaySinh_141;
        this.soCMND_141 = soCMND_141;
    }

    public String getSoCMND_141() {
        return soCMND_141;
    }

    public void hienThiThongTin_141() {
        System.out.printf("Họ tên: %s, Ngày sinh: %s, CMND: %s%n", hoTen_141, ngaySinh_141, soCMND_141);
    }
}
