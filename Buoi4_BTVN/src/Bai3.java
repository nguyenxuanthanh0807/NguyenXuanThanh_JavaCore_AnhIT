import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Hỏi người dùng số lượng phần tử trong mảng
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        // Tạo mảng để chứa các số
        int[] numbers = new int[n];

        // Hỏi người dùng nhập các số vào mảng
        System.out.println("Nhập " + n + " số: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Giả sử phần tử đầu tiên là số lớn nhất
        int largest = numbers[0];

        // Duyệt qua mảng để tìm số lớn nhất
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // In ra số lớn nhất
        System.out.println("Số lớn nhất trong mảng là: " + largest);

        // Đóng scanner
        scanner.close();
    }
}

