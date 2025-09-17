public class Bai2 {
    public static void main(String[] args) {
        // Khai báo mảng cho trước
        int[] arr = {1, 2, 3, 4, 5};

        // Biến lưu tổng
        int tong = 0;

        // Tính tổng các phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }

        // In kết quả
        System.out.println("Mảng {1, 2, 3, 4, 5}");
        System.out.println("Tổng các phần tử trong mảng = " + tong);
    }
}

