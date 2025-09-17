import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử trong mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Nhập các phần tử vào mảng
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // In mảng ban đầu
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Đảo ngược mảng (in từ cuối về đầu)
        System.out.print("\nMảng sau khi đảo ngược: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}

