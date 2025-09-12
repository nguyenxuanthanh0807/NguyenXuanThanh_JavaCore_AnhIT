//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Bai5 {
    public Bai5() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Số dương");
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("Bằng 0");
        }

        scanner.close();
    }
}
