//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SanPham {
    private String tenSanPham;
    private double giaTien;
    private int soThuTu;
    private static int count = 0;
    private static int nextId = 0;

    public SanPham(String tenSanPham, double giaTien) {
        this.tenSanPham = tenSanPham;
        this.giaTien = giaTien;
        ++nextId;
        this.soThuTu = nextId;
        ++count;
    }

    public void hienThiThongTin() {
        System.out.println("Sản phẩm số: " + this.soThuTu);
        System.out.println("Tên sản phẩm: " + this.tenSanPham);
        System.out.println("Giá tiền: " + this.giaTien + " VND");
        System.out.println("--------------------------");
    }

    public int getSoThuTu() {
        return this.soThuTu;
    }

    public static void hienThiTongSoSanPham() {
        System.out.println("Tổng số sản phẩm đang có: " + count);
    }

    public static void giamCount() {
        if (count > 0) {
            --count;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSach = new ArrayList();

        while(true) {
            while(true) {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiển thị sản phẩm");
                System.out.println("3. Xóa sản phẩm theo số thứ tự");
                System.out.println("4. Thoát");
                System.out.print("Chọn: ");
                int chon = scanner.nextInt();
                scanner.nextLine();
                if (chon == 1) {
                    System.out.print("Tên sản phẩm: ");
                    String ten = scanner.nextLine();
                    System.out.print("Giá tiền: ");
                    double gia = scanner.nextDouble();
                    scanner.nextLine();
                    SanPham sp = new SanPham(ten, gia);
                    danhSach.add(sp);
                } else if (chon == 2) {
                    System.out.println("\n===== Danh sách sản phẩm =====");
                    Iterator var8 = danhSach.iterator();

                    while(var8.hasNext()) {
                        SanPham sp = (SanPham)var8.next();
                        sp.hienThiThongTin();
                    }

                    hienThiTongSoSanPham();
                } else if (chon != 3) {
                    if (chon == 4) {
                        System.out.println("Thoát chương trình!");
                        scanner.close();
                        return;
                    }
                } else {
                    System.out.print("Nhập số thứ tự cần xóa: ");
                    int stt = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for(int i = 0; i < danhSach.size(); ++i) {
                        if (((SanPham)danhSach.get(i)).getSoThuTu() == stt) {
                            danhSach.remove(i);
                            giamCount();
                            found = true;
                            System.out.println("✅ Đã xóa sản phẩm số " + stt);
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ Không tìm thấy sản phẩm số " + stt);
                    }
                }
            }
        }
    }
}
