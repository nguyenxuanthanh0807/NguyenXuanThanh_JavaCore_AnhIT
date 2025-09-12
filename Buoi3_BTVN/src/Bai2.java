public class Bai2 {
    public static void main(String[] args) {
        int i = 2;

        System.out.println("Các số chẵn từ 2 đến 200:");
        System.out.println("=========================");

        while (i <= 200) {
            System.out.print(i + " ");
            i += 2; // Tăng lên 2 đơn vị để đến số chẵn tiếp theo
        }
    }
}