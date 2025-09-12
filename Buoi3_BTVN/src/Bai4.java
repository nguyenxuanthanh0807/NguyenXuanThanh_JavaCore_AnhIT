import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        long giaiThua = 1; // dùng long để tránh tràn số khi n lớn

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println(n + "! = " + giaiThua);

        sc.close();
    }
}
