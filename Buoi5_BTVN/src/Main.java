public class Main {
    public static void main(String[] args) {
        // Tạo ít nhất 2 học sinh
        HocSinh hs1 = new HocSinh("Nguyễn Xuân Thành", 15, "10A1");
        HocSinh hs2 = new HocSinh("Kieu Tien Dat", 16, "11B2");

        // Gọi phương thức hocBai()
        hs1.hocBai();
        hs2.hocBai();

    }
}