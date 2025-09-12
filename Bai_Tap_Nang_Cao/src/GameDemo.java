import java.util.Random;

class Player {
    private String name;
    private int health;
    private static final int MAX_HEALTH = 100;

    public Player(String name) {
        this.name = name;
        this.health = MAX_HEALTH;
    }

    public void attack(Player enemy) {
        Random rand = new Random();
        int damage = rand.nextInt(21) + 10; // random 10–30
        enemy.health -= damage;
        if (enemy.health < 0) {
            enemy.health = 0;
        }

        System.out.println(this.name + " tấn công " + enemy.name + " gây "
                + damage + " sát thương.");
        System.out.println("Máu còn lại của " + enemy.name + ": " + enemy.health);
        System.out.println("------------------------");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

public class GameDemo {
    public static void main(String[] args) {
        Player p1 = new Player("Người chơi 1");
        Player p2 = new Player("Người chơi 2");

        System.out.println("=== Bắt đầu trận đấu ===");

        for (int round = 1; round <= 3; round++) {
            System.out.println("\n--- Lượt " + round + " ---");

            // Người chơi 1 tấn công
            p1.attack(p2);
            if (p2.getHealth() <= 0) {
                System.out.println("💀 " + p2.getName() + " đã bị hạ gục!");
                System.out.println("🏆 " + p1.getName() + " chiến thắng!");
                break;
            }

            // Người chơi 2 tấn công
            p2.attack(p1);
            if (p1.getHealth() <= 0) {
                System.out.println("💀 " + p1.getName() + " đã bị hạ gục!");
                System.out.println("🏆 " + p2.getName() + " chiến thắng!");
                break;
            }

            // Nếu kết thúc đủ 3 lượt mà cả 2 còn sống
            if (round == 3) {
                System.out.println("=== Trận đấu kết thúc sau 3 lượt ===");
                if (p1.getHealth() > p2.getHealth()) {
                    System.out.println("🏆 " + p1.getName() + " chiến thắng!");
                } else if (p2.getHealth() > p1.getHealth()) {
                    System.out.println("🏆 " + p2.getName() + " chiến thắng!");
                } else {
                    System.out.println("🤝 Hòa!");
                }
            }
        }
    }
}
