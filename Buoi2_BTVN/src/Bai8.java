//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Bai8 {
    public Bai8() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tháng (1 - 12): ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Mùa Đông ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Mùa Xuân ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mùa Hạ ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Mùa Thu");
                break;
            default:
                System.out.println("Tháng không hợp lệ ");
        }

        scanner.close();
    }
}
