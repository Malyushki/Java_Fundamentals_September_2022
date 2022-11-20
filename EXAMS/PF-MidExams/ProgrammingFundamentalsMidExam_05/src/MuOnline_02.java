import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dungeon = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;
        boolean dead = false;
        for (int i = 0; i < dungeon.length; i++) {
            String[] room = dungeon[i].split(" ");
            switch (room[0]) {
                case "potion":
                    health = potion(health, Integer.parseInt(room[1]));
                    break;
                case "chest":
                    bitcoins = chest(bitcoins, Integer.parseInt(room[1]));
                    break;
                default:
                    health = monsterKilLed(health, room[0], Integer.parseInt(room[1]));
                    break;
            }
            if (health <= 0) {
                dead = true;
                System.out.printf("Best room: %d%n", i + 1);
                break;
            }
        }

        if (!dead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }

    static int potion(int health, int potion) {
        if (health + potion <= 100) {
            health += potion;
            System.out.printf("You healed for %d hp.%n", potion);
            System.out.printf("Current health: %d hp.%n", health);
        } else {
            System.out.printf("You healed for %d hp.%n", 100 - health);
            health = 100;
            System.out.printf("Current health: %d hp.%n", health);
        }
        return health;
    }

    static int chest(int bitcoins, int foundBitcoins) {
        System.out.printf("You found %d bitcoins.%n", foundBitcoins);
        bitcoins += foundBitcoins;
        return bitcoins;
    }

    static int monsterKilLed(int health, String monsterName, int damage) {
        if (damage < health) {
            System.out.printf("You slayed %s.%n", monsterName);
            health -= damage;
        } else {
            System.out.printf("You died! Killed by %s.%n", monsterName);
            health = 0;
        }
        return health;
    }
}
