import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> danhSach_2138 = new ArrayList<>();

    // Nhập thông tin khách trọ
    public void nhapKhachTro_2138(Scanner sc_2138) {
        System.out.print("Nhập số khách trọ: ");
        int n_2138 = sc_2138.nextInt();
        sc_2138.nextLine();

        for (int i_2138 = 0; i_2138 < n_2138; i_2138++) {
            System.out.println("\nKhách trọ thứ " + (i_2138 + 1));
            System.out.print("Họ tên: ");
            String hoTen_2138 = sc_2138.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh_2138 = sc_2138.nextLine();
            System.out.print("Số CMND: ");
            String soCMND_2138 = sc_2138.nextLine();

            System.out.print("Số ngày trọ: ");
            int soNgayTro_2138 = sc_2138.nextInt();
            sc_2138.nextLine();
            System.out.print("Loại phòng: ");
            String loaiPhong_2138 = sc_2138.nextLine();
            System.out.print("Giá phòng: ");
            double giaPhong_2138 = sc_2138.nextDouble();
            sc_2138.nextLine();

            Nguoi nguoi_2138 = new Nguoi(hoTen_2138, ngaySinh_2138, soCMND_2138);
            KhachTro khachTro_2138 = new KhachTro(nguoi_2138, soNgayTro_2138, loaiPhong_2138, giaPhong_2138);
            danhSach_2138.add(khachTro_2138);
        }
    }

    // Hiển thị tất cả khách trọ
    public void hienThiTatCa_2138() {
        for (KhachTro kt_2138 : danhSach_2138) {
            kt_2138.hienThiThongTin_2138();
            System.out.println("-----------------");
        }
    }

    // Xóa khách trọ theo CMND
    public void xoaKhachTro_2138(String soCMND_2138) {
        danhSach_2138.removeIf(khachTro_2138 -> khachTro_2138.getSoCMND_2138().equalsIgnoreCase(soCMND_2138));
    }

    // Tính tiền trả phòng theo CMND
    public void tinhTienTheoCMND_2138(String soCMND_2138) {
        boolean found_2138 = false;
        for (KhachTro kt_2138 : danhSach_2138) {
            if (kt_2138.getSoCMND_2138().equalsIgnoreCase(soCMND_2138)) {
                System.out.println("Thông tin khách trọ:");
                kt_2138.hienThiThongTin_2138();
                System.out.printf("Số tiền phải trả: %.2f%n", kt_2138.tinhTien_2138());
                found_2138 = true;
            }
        }
        if (!found_2138) {
            System.out.println("❗ Không tìm thấy khách có CMND: " + soCMND_2138);
        }
    }
}