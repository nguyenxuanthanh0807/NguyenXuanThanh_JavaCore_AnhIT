//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Bai4 {
    public Bai4() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào điểm số (0 - 100): ");
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 85) {
                System.out.println("Giỏi");
            } else if (score >= 65) {
                System.out.println("Khá");
            } else if (score >= 50) {
                System.out.println("Trung bình");
            } else {
                System.out.println("Yếu");
            }
        } else {
            System.out.println("Điểm không hợp lệ! Vui lòng nhập từ 0 đến 100.");
        }

        scanner.close();
    }
}
