// File: Main.java
class HocSinh {
    // Thuộc tính (biến thành viên)
    String ten;
    int tuoi;
    String lop;

    // Constructor
    public HocSinh(String ten, int tuoi, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    // Phương thức
    public void hocBai() {
        System.out.println(ten + " (" + tuoi + " tuổi, lớp " + lop + ") đang học bài.");
    }
}



