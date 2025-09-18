import java.util.Scanner;

// Lớp cha
class Nguoi {
    protected String ten;
    protected int tuoi;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    // Nhập thông tin người
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine(); // bỏ ký tự xuống dòng
    }

    // Xuất thông tin
    public void gioiThieu() {
        System.out.println("Xin chào, tôi tên là " + ten + ", " + tuoi + " tuổi.");
    }
}

// Lớp con kế thừa từ Nguoi
class SinhVien extends Nguoi {
    private String maSV;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, String maSV) {
        super(ten, tuoi);
        this.maSV = maSV;
    }

    // Nhập thông tin sinh viên (kế thừa từ Nguoi)
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc); // nhập tên và tuổi
        System.out.print("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
    }

    // Xuất thông tin học tập
    public void hocTap() {
        System.out.println("Sinh viên " + ten + " (Mã SV: " + maSV + ") đang học tập chăm chỉ.");
    }
}

// Lớp Main
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo đối tượng sinh viên và nhập thông tin
        SinhVien sv = new SinhVien();
        sv.nhapThongTin(sc);

        // In ra thông tin và gọi phương thức học tập
        sv.gioiThieu();
        sv.hocTap();

        sc.close();
    }
}
