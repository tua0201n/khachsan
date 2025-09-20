public class Nguoi {
    private String hoTen_2138;
    private String ngaySinh_2138;
    private String soCMND_2138;

    public Nguoi(String hoTen_2138, String ngaySinh_2138, String soCMND_2138) {
        this.hoTen_2138 = hoTen_2138;
        this.ngaySinh_2138 = ngaySinh_2138;
        this.soCMND_2138 = soCMND_2138;
    }

    public String getSoCMND_2138() {
        return soCMND_2138;
    }

    public void hienThiThongTin_2138() {
        System.out.printf("Họ tên: %s, Ngày sinh: %s, CMND: %s%n", hoTen_2138, ngaySinh_2138, soCMND_2138);
    }
}