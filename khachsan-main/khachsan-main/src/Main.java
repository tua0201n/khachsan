import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_2138 = new Scanner(System.in);
        KhachSan khachSan_2138 = new KhachSan();

        while (true) {
            System.out.println("\n===== MENU KHÁCH SẠN =====");
            System.out.println("1. Nhập thông tin khách trọ");
            System.out.println("2. Hiển thị tất cả khách trọ");
            System.out.println("3. Xóa khách trọ theo CMND");
            System.out.println("4. Tính tiền trả phòng theo CMND");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int chon_2138 = sc_2138.nextInt();
            sc_2138.nextLine();

            switch (chon_2138) {
                case 1 -> khachSan_2138.nhapKhachTro_2138(sc_2138);
                case 2 -> khachSan_2138.hienThiTatCa_2138();
                case 3 -> {
                    System.out.print("Nhập CMND khách cần xóa: ");
                    String cmndXoa_2138 = sc_2138.nextLine();
                    khachSan_2138.xoaKhachTro_2138(cmndXoa_2138);
                }
                case 4 -> {
                    System.out.print("Nhập CMND khách cần tính tiền: ");
                    String cmndTinh_2138 = sc_2138.nextLine();
                    khachSan_2138.tinhTienTheoCMND_2138(cmndTinh_2138);
                }
                case 5 -> {
                    System.out.println("Thoát chương trình.");
                    sc_2138.close();
                    return;
                }
                default -> System.out.println("❗ Lựa chọn không hợp lệ!");
            }
        }
    }
}