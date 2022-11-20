import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warshipShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String commands = scanner.nextLine();
        boolean warshipShipSunken = false;
        boolean pirateShipSunken = false;
        while (!commands.equals("Retire")) {
            String[] commandType = commands.split(" ");
            switch (commandType[0]) {
                case "Fire":
                    int index = Integer.parseInt(commandType[1]);
                    int damage = Integer.parseInt(commandType[2]);
                    if (index >= 0 && index < warshipShip.size()) {
                        warshipShip.set(index, warshipShip.get(index) - damage);
                        if (warshipShip.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            warshipShipSunken = true;
                            break;
                        }
                    }
                    break;
                case "Defend":
                    int indexStart = Integer.parseInt(commandType[1]);
                    int indexEnd = Integer.parseInt(commandType[2]);
                    damage = Integer.parseInt(commandType[3]);
                    if (indexStart >= 0 && indexStart < pirateShip.size() && indexEnd >= 0 && indexEnd < pirateShip.size()) {
                        for (int i = indexStart; i <= indexEnd; i++) {
                            pirateShip.set(i, pirateShip.get(i) - damage);
                            if (pirateShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                pirateShipSunken = true;
                                break;
                            }
                        }
                    }
                    break;
                case "Repair":
                    index = Integer.parseInt(commandType[1]);
                    int health = Integer.parseInt(commandType[2]);
                    if (index >= 0 && index < pirateShip.size()) {
                        if (pirateShip.get(index) + health >= maxHealth) {
                            pirateShip.set(index, maxHealth);
                        } else {
                            pirateShip.set(index, (pirateShip.get(index) + health));
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    double minHealth = maxHealth * 0.2;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        if (pirateShip.get(i) < minHealth) {
                            count++;
                        }
                    }

                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }

            if (!warshipShipSunken && !pirateShipSunken) {
                commands = scanner.nextLine();
            } else {
                break;
            }
        }
        if (!warshipShipSunken && !pirateShipSunken){
            int statusPirates = pirateShip.stream().mapToInt(Integer::intValue).sum();
            int statusWarship = warshipShip.stream().mapToInt(Integer::intValue).sum();
            System.out.printf("Pirate ship status: %d%n",statusPirates);
            System.out.printf("Warship status: %d%n",statusWarship);
            }
        }
    }

