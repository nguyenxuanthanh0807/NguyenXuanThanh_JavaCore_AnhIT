//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Bai2 {
    public Bai2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tuổi của bạn: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Đủ điều kiện lái xe");
        } else {
            System.out.println("Chưa đủ điều kiện lái xe");
        }

        scanner.close();
    }
}
