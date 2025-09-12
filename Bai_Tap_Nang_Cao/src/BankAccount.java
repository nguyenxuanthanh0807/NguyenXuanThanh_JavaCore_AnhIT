import java.util.Scanner;

public class BankAccount {
    private String soTaiKhoan;
    private double soDu;
    private static double laiSuat = 0.05;

    public BankAccount(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }

    public double tinhTienLai() {
        double tienLai = this.soDu * laiSuat;
        return tienLai;
    }

    public void hienThiThongTin() {
        System.out.println("Số tài khoản: " + this.soTaiKhoan);
        System.out.println("Số dư: " + this.soDu + " VND");
        System.out.println("Tiền lãi: " + this.tinhTienLai() + " VND");
        System.out.println("--------------------------");
    }

    public static void setLaiSuat(double lai) {
        laiSuat = lai;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lãi suất (%): ");
        double ls = scanner.nextDouble() / 100.0;
        setLaiSuat(ls);
        System.out.println("\n--- Nhập thông tin tài khoản 1 ---");
        System.out.print("Nhập số tài khoản: ");
        String stk1 = scanner.next();
        System.out.print("Nhập số dư: ");
        double sd1 = scanner.nextDouble();
        BankAccount acc1 = new BankAccount(stk1, sd1);
        System.out.println("\n--- Nhập thông tin tài khoản 2 ---");
        System.out.print("Nhập số tài khoản: ");
        String stk2 = scanner.next();
        System.out.print("Nhập số dư: ");
        double sd2 = scanner.nextDouble();
        BankAccount acc2 = new BankAccount(stk2, sd2);
        System.out.println("\n===== Thông tin các tài khoản =====");
        acc1.hienThiThongTin();
        acc2.hienThiThongTin();
        scanner.close();
    }
}