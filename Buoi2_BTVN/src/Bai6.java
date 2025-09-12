//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Bai6 {
    public Bai6() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== MENU ĐỒ UỐNG =====");
        System.out.println("1. Cà phê");
        System.out.println("2. Trà sữa");
        System.out.println("3. Nước lọc");
        System.out.print("Mời bạn chọn (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Bạn đã chọn Cafe");
                break;
            case 2:
                System.out.println("Bạn đã chọn Trà Sữa");
                break;
            case 3:
                System.out.println("Bạn đã chọn Nước Lọc");
                break;
            default:
                System.out.println("Bạn đã chọn Không có trong Menu");
        }

        scanner.close();
    }
}
