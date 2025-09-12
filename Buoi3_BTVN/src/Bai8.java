public class Bai8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int tong = 0;

        // duyệt mảng bằng for-each
        for (int num : arr) {
            if (num % 2 == 0) { // kiểm tra số chẵn
                tong += num;
            }
        }

        System.out.println("Tổng các số chẵn trong mảng là: " + tong);
    }
}
