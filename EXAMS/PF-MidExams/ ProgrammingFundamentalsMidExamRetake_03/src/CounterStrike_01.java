import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wonBattles = 0;
        int energy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        boolean outOfEnergy = false;
        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if (distance > energy) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, energy);
                outOfEnergy = true;
                break;
            } else {
                energy -= distance;
                wonBattles++;
                if (wonBattles % 3 == 0 && wonBattles != 0) {
                    energy += wonBattles;
                }
            }
            command = scanner.nextLine();
        }

        if (!outOfEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, energy);
        }
    }

}
