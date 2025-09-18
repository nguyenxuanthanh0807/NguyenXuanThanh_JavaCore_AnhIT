// Lớp cha
class DongVat {
    public void keu() {
        System.out.println("Động vật kêu...");
    }
}

// Lớp Cho kế thừa từ DongVat
class Cho extends DongVat {
    @Override
    public void keu() {
        System.out.println("Gâu gâu");
    }
}

// Lớp Meo kế thừa từ DongVat
class Meo extends DongVat {
    @Override
    public void keu() {
        System.out.println("Meo meo");
    }
}

// Lớp Main
public class Bai4 {
    public static void main(String[] args) {
        // Tạo mảng động vật
        DongVat[] dsDongVat = new DongVat[4];
        dsDongVat[0] = new Cho();
        dsDongVat[1] = new Meo();
        dsDongVat[2] = new Cho();
        dsDongVat[3] = new Meo();

        // Duyệt mảng và gọi keu()
        for (DongVat dv : dsDongVat) {
            dv.keu();  // đa hình xảy ra ở đây
        }
    }
}
