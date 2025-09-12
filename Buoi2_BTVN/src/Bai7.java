import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tuổi của khách: ");
        int tuoi = scanner.nextInt();
        int giaVe = 0;

        if (tuoi < 12) {
            giaVe = 20000;
        } else if (tuoi >= 12 && tuoi <= 17) {
            giaVe = 40000;
        } else if (tuoi >= 18) {
            giaVe = 60000;
        }

        System.out.println("Giá vé: " + giaVe + "đ");
    }
}