//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class HocSinh {
    private String ten;
    private int tuoi;
    private double gpa;
    private static String truong = "THPT Nguyen Trai";

    public HocSinh(String ten, int tuoi, double gpa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gpa = gpa;
    }

    public void displayInfo() {
        String rank;
        if (this.gpa >= 8.0) {
            rank = "Giỏi";
        } else if (this.gpa >= 6.5) {
            rank = "Khá";
        } else {
            rank = "Trung bình";
        }

        System.out.println("Tên: " + this.ten);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Xếp loại: " + rank);
        System.out.println("Trường: " + truong);
        System.out.println("--------------------------");
    }

    public static void setTruong(String tenTruong) {
        truong = tenTruong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên trường: ");
        String tenTruong = scanner.nextLine();
        setTruong(tenTruong);
        System.out.println("\n--- Nhập thông tin học sinh 1 ---");
        System.out.print("Tên: ");
        String ten1 = scanner.nextLine();
        System.out.print("Tuổi: ");
        int tuoi1 = scanner.nextInt();
        System.out.print("GPA: ");
        double gpa1 = scanner.nextDouble();
        scanner.nextLine();
        HocSinh hs1 = new HocSinh(ten1, tuoi1, gpa1);
        System.out.println("\n--- Nhập thông tin học sinh 2 ---");
        System.out.print("Tên: ");
        String ten2 = scanner.nextLine();
        System.out.print("Tuổi: ");
        int tuoi2 = scanner.nextInt();
        System.out.print("GPA: ");
        double gpa2 = scanner.nextDouble();
        HocSinh hs2 = new HocSinh(ten2, tuoi2, gpa2);
        System.out.println("\n===== Thông tin học sinh =====");
        hs1.displayInfo();
        hs2.displayInfo();
        scanner.close();
    }
}
