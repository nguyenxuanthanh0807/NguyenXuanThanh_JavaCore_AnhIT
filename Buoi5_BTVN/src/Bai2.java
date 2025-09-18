import java.util.Scanner;

class TaiKhoanNganHang {
    // Thuộc tính private
    private String soTaiKhoan;
    private double soDu;

    // Constructor
    public TaiKhoanNganHang(String soTaiKhoan, double soDuBanDau) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDuBanDau;
    }

    // Getter số tài khoản
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    // Phương thức nạp tiền
    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("✅ Nạp thành công: " + soTien + " VND");
        } else {
            System.out.println("❌ Số tiền nạp không hợp lệ!");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("✅ Rút thành công: " + soTien + " VND");
        } else {
            System.out.println("❌ Số tiền rút không hợp lệ hoặc vượt quá số dư!");
        }
    }

    // Phương thức xem số dư
    public void xemSoDu() {
        System.out.println("💰 Số dư hiện tại của tài khoản " + soTaiKhoan + " là: " + soDu + " VND");
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoanNganHang tk = null; // Ban đầu chưa có tài khoản
        int chon;

        do {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Tạo tài khoản");
            System.out.println("2. Xem số dư");
            System.out.println("3. Nạp tiền");
            System.out.println("4. Rút tiền");
            System.out.println("0. Thoát");
            System.out.print("👉 Mời bạn chọn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1: // Tạo tài khoản
                    System.out.print("Nhập số tài khoản: ");
                    String soTK = sc.next();
                    System.out.print("Nhập số dư ban đầu: ");
                    double soDuBanDau = sc.nextDouble();
                    tk = new TaiKhoanNganHang(soTK, soDuBanDau);
                    System.out.println("✅ Tạo tài khoản thành công!");
                    break;

                case 2: // Xem số dư
                    if (tk != null) {
                        tk.xemSoDu();
                    } else {
                        System.out.println("⚠️ Bạn chưa tạo tài khoản!");
                    }
                    break;

                case 3: // Nạp tiền
                    if (tk != null) {
                        System.out.print("Nhập số tiền cần nạp: ");
                        double nap = sc.nextDouble();
                        tk.napTien(nap);
                    } else {
                        System.out.println("⚠️ Bạn chưa tạo tài khoản!");
                    }
                    break;

                case 4: // Rút tiền
                    if (tk != null) {
                        System.out.print("Nhập số tiền cần rút: ");
                        double rut = sc.nextDouble();
                        tk.rutTien(rut);
                    } else {
                        System.out.println("⚠️ Bạn chưa tạo tài khoản!");
                    }
                    break;

                case 0:
                    System.out.println("🚪 Thoát chương trình.");
                    break;

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);

        sc.close();
    }
}
