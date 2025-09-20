import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc_141 = new Scanner(System.in);
        KhachSan khachSan_141 = new KhachSan();

        while (true) {
            System.out.println("\n===== MENU KHÁCH SẠN =====");
            System.out.println("1. Nhập thông tin khách trọ");
            System.out.println("2. Hiển thị tất cả khách trọ");
            System.out.println("3. Xóa khách trọ theo CMND");
            System.out.println("4. Tính tiền trả phòng theo CMND");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int chon_141 = sc_141.nextInt();
            sc_141.nextLine();

            switch (chon_141) {
                case 1 -> khachSan_141.nhapKhachTro_141(sc_141);
                case 2 -> khachSan_141.hienThiTatCa_141();
                case 3 -> {
                    System.out.print("Nhập CMND khách cần xóa: ");
                    String cmndXoa_141 = sc_141.nextLine();
                    khachSan_141.xoaKhachTro_141(cmndXoa_141);
                }
                case 4 -> {
                    System.out.print("Nhập CMND khách cần tính tiền: ");
                    String cmndTinh_141 = sc_141.nextLine();
                    khachSan_141.tinhTienTheoCMND_141(cmndTinh_141);
                }
                case 5 -> {
                    System.out.println("Thoát chương trình.");
                    sc_141.close();
                    return;
                }
                default -> System.out.println("❗ Lựa chọn không hợp lệ!");
            }
        }
    }
}
