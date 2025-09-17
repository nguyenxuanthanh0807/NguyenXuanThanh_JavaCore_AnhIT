import java.util.Scanner;

public class Bai4 {
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

        // Khởi tạo các biến đếm số chẵn và số lẻ
        int evenCount = 0;
        int oddCount = 0;

        // Duyệt qua mảng để đếm số chẵn và số lẻ
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;  // Số chẵn
            } else {
                oddCount++;   // Số lẻ
            }
        }

        // In ra số lượng số chẵn và số lẻ
        System.out.println("Số lượng số chẵn trong mảng: " + evenCount);
        System.out.println("Số lượng số lẻ trong mảng: " + oddCount);

        // Đóng scanner
        scanner.close();
    }
}

