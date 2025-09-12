//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Bai9 {
    public Bai9() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double so1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double so2 = scanner.nextDouble();
        System.out.print("Nhập toán tử (+, -, *, /): ");
        char toanTu = scanner.next().charAt(0);
        double ketQua;
        switch (toanTu) {
            case '*':
                ketQua = so1 * so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case '+':
                ketQua = so1 + so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case ',':
            case '.':
            default:
                System.out.println("❌ Toán tử không hợp lệ!");
                break;
            case '-':
                ketQua = so1 - so2;
                System.out.println("Kết quả: " + ketQua);
                break;
            case '/':
                if (so2 != 0.0) {
                    ketQua = so1 / so2;
                    System.out.println("Kết quả: " + ketQua);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                }
        }

        scanner.close();
    }
}
