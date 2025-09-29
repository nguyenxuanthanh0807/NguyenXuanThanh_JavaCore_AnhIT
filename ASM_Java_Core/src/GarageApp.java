import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/* ===== Lớp cha Vehicle ===== */
abstract class Vehicle {
    private static int autoId = 1;     // id tự tăng
    private static int totalVehicles = 0; // đếm tổng số xe

    private final int id;
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private String type;

    // Constructor mặc định
    public Vehicle() {
        this.id = autoId++;
        totalVehicles++;
    }

    // Constructor overloading
    public Vehicle(String brand, String model, int year, double price, String color, String type) {
        this.id = autoId++;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.type = type;
        totalVehicles++;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    // Getters/Setters
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Phương thức giảm giá (được override ở Car, Truck)
    public abstract void applyDiscount();

    @Override
    public String toString() {
        return String.format("ID: %d | %s %s | Year: %d | Price: %.0f | Color: %s | Type: %s",
                id, brand, model, year, price, color, type);
    }
}

/* ===== Car (kế thừa Vehicle) ===== */
class Car extends Vehicle {
    private int seatCount;

    public Car(String brand, String model, int year, double price, String color, int seatCount) {
        super(brand, model, year, price, color, "Car");
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public void applyDiscount() {
        setPrice(getPrice() * 0.85); // giảm 15%
    }

    @Override
    public String toString() {
        return super.toString() + " | Seats: " + seatCount;
    }
}

/* ===== Truck (kế thừa Vehicle) ===== */
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double price, String color, double loadCapacity) {
        super(brand, model, year, price, color, "Truck");
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void applyDiscount() {
        setPrice(getPrice() * 0.80); // giảm 20%
    }

    @Override
    public String toString() {
        return super.toString() + " | Load: " + loadCapacity + " tấn";
    }
}

/* ===== Main App: Menu ===== */
public class GarageApp {
    private static final ArrayList<Vehicle> vehicles = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addVehicle();
                case 2 -> removeVehicle();
                case 3 -> showVehicles();
                case 4 -> searchByBrand();
                case 5 -> sortByPrice();
                case 6 -> sortByYear();
                case 0 -> System.out.println("Thoát chương trình!");
                default -> System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    private static void printMenu() {
        System.out.println("===== QUẢN LÝ GARA XE =====");
        System.out.println("1. Thêm xe mới");
        System.out.println("2. Xóa xe theo ID");
        System.out.println("3. Hiển thị danh sách xe");
        System.out.println("4. Tìm kiếm xe theo hãng");
        System.out.println("5. Sắp xếp xe theo giá tăng dần");
        System.out.println("6. Sắp xếp xe theo năm sản xuất giảm dần");
        System.out.println("0. Thoát");
        System.out.println("===========================");
    }

    /* ===== 1. Thêm xe ===== */
    private static void addVehicle() {
        System.out.println("Chọn loại xe: 1.Car  2.Truck");
        int type = Integer.parseInt(sc.nextLine());

        System.out.print("Brand: ");
        String brand = sc.nextLine();
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Year: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Color: ");
        String color = sc.nextLine();

        if (type == 1) {
            System.out.print("Seats: ");
            int seats = Integer.parseInt(sc.nextLine());
            vehicles.add(new Car(brand, model, year, price, color, seats));
        } else {
            System.out.print("Load capacity (tấn): ");
            double load = Double.parseDouble(sc.nextLine());
            vehicles.add(new Truck(brand, model, year, price, color, load));
        }

        System.out.println("✅ Xe đã được thêm!");
        System.out.println("Tổng số xe hiện tại: " + Vehicle.getTotalVehicles());
        System.out.println(Vehicle.getTotalVehicles() > 20 ? "Gara lớn" : "Gara nhỏ");
    }

    /* ===== 2. Xóa xe theo ID ===== */
    private static void removeVehicle() {
        System.out.print("Nhập ID xe cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean removed = vehicles.removeIf(v -> v.getId() == id);
        if (removed) System.out.println("✅ Đã xóa xe có ID: " + id);
        else System.out.println("❌ Không tìm thấy xe!");
    }

    /* ===== 3. Hiển thị danh sách xe ===== */
    private static void showVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("❌ Gara trống!");
            return;
        }
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
        System.out.println("Tổng số xe hiện tại: " + Vehicle.getTotalVehicles());
        System.out.println(Vehicle.getTotalVehicles() > 20 ? "Gara lớn" : "Gara nhỏ");
    }

    /* ===== 4. Tìm kiếm xe theo hãng ===== */
    private static void searchByBrand() {
        System.out.print("Nhập hãng cần tìm: ");
        String brand = sc.nextLine();
        boolean found = false;
        for (Vehicle v : vehicles) {
            if (v.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(v);
                found = true;
            }
        }
        if (!found) System.out.println("❌ Không có xe nào của hãng: " + brand);
    }

    /* ===== 5. Sắp xếp xe theo giá tăng dần ===== */
    private static void sortByPrice() {
        Collections.sort(vehicles, Comparator.comparingDouble(Vehicle::getPrice));
        System.out.println("✅ Đã sắp xếp theo giá tăng dần!");
        showVehicles();
    }

    /* ===== 6. Sắp xếp xe theo năm sản xuất giảm dần ===== */
    private static void sortByYear() {
        Collections.sort(vehicles, (v1, v2) -> Integer.compare(v2.getYear(), v1.getYear()));
        System.out.println("✅ Đã sắp xếp theo năm sản xuất giảm dần!");
        showVehicles();
    }
}
