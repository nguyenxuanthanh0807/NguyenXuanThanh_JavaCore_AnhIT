public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Các số từ 1 đến 100 và tính chất:");
        System.out.println("--------------------------------");

        for (int i = 1; i <= 100; i++) {
            String tinhChat = (i % 2 == 0) ? "Chẵn" : "Lẻ";
            System.out.println("Số " + i + " là số " + tinhChat);
        }
    }
}