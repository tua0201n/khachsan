import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> danhSach_141 = new ArrayList<>();

    // Nhập thông tin khách trọ
    public void nhapKhachTro_141(Scanner sc_141) {
        System.out.print("Nhập số khách trọ: ");
        int n_141 = sc_141.nextInt();
        sc_141.nextLine();

        for (int i_141 = 0; i_141 < n_141; i_141++) {
            System.out.println("\nKhách trọ thứ " + (i_141 + 1));
            System.out.print("Họ tên: ");
            String hoTen_141 = sc_141.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh_141 = sc_141.nextLine();
            System.out.print("Số CMND: ");
            String soCMND_141 = sc_141.nextLine();

            System.out.print("Số ngày trọ: ");
            int soNgayTro_141 = sc_141.nextInt();
            sc_141.nextLine();
            System.out.print("Loại phòng: ");
            String loaiPhong_141 = sc_141.nextLine();
            System.out.print("Giá phòng: ");
            double giaPhong_141 = sc_141.nextDouble();
            sc_141.nextLine();

            Nguoi nguoi_141 = new Nguoi(hoTen_141, ngaySinh_141, soCMND_141);
            KhachTro khachTro_141 = new KhachTro(nguoi_141, soNgayTro_141, loaiPhong_141, giaPhong_141);
            danhSach_141.add(khachTro_141);
        }
    }

    // Hiển thị tất cả khách trọ
    public void hienThiTatCa_141() {
        for (KhachTro kt_141 : danhSach_141) {
            kt_141.hienThiThongTin_141();
            System.out.println("-----------------");
        }
    }

    // Xóa khách trọ theo CMND
    public void xoaKhachTro_141(String soCMND_141) {
        danhSach_141.removeIf(khachTro_141 -> khachTro_141.getSoCMND_141().equalsIgnoreCase(soCMND_141));
    }

    // Tính tiền trả phòng theo CMND
    public void tinhTienTheoCMND_141(String soCMND_141) {
        boolean found_141 = false;
        for (KhachTro kt_141 : danhSach_141) {
            if (kt_141.getSoCMND_141().equalsIgnoreCase(soCMND_141)) {
                System.out.println("Thông tin khách trọ:");
                kt_141.hienThiThongTin_141();
                System.out.printf("Số tiền phải trả: %.2f%n", kt_141.tinhTien_141());
                found_141 = true;
            }
        }
        if (!found_141) {
            System.out.println("❗ Không tìm thấy khách có CMND: " + soCMND_141);
        }
    }
}
