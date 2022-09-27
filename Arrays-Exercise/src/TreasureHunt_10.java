import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> treasureChest = new ArrayList<String>(Arrays.asList(scanner.nextLine().split("\\|")));
        String command = scanner.nextLine();
        boolean isEmpty = false;
        int countGains = 0;
        while (!command.equals("Yohoho!")) {
            String[] commandType = command.split(" ");
            switch (commandType[0]) {
                case "Loot":
                    for (int i = 1; i < commandType.length; i++) {
                        boolean isContained = treasureChest.contains(commandType[i]);
                        if (!isContained)
                            treasureChest.add(0, commandType[i]);
                    }
                    break;
                case "Drop":
                    int indexSwap = Integer.parseInt(commandType[1]);
                    if (indexSwap < treasureChest.size() && indexSwap >= 0) {
                        String dropItem = treasureChest.get(indexSwap);
                        for (int i = indexSwap; i < treasureChest.size() - 1; i++) {
                            Collections.swap(treasureChest, i, i + 1);
                        }
                        treasureChest.add(treasureChest.size(), dropItem);
                        treasureChest.remove((treasureChest.size() - 1));
                    }
                    break;
                case "Steal":
                    int indexSteal = Integer.parseInt(commandType[1]);
                    int removeItem = treasureChest.size() - indexSteal;
                    int initialSize = treasureChest.size();
                    if (indexSteal < treasureChest.size()) {
                        for (int i = (treasureChest.size() - indexSteal); i < treasureChest.size() - 1; i++) {
                            System.out.print(treasureChest.get(i) + ", ");
                        }
                        System.out.println(treasureChest.get(treasureChest.size() - 1));
                        for (int i = removeItem; i < initialSize; i++) {
                            treasureChest.remove(removeItem);
                        }
                    } else {
                        for (int i = 0; i < treasureChest.size() - 1; i++) {
                            System.out.print(treasureChest.get(i) + ", ");
                        }
                        System.out.println(treasureChest.get(treasureChest.size() - 1));
                        isEmpty = true;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (!isEmpty) {
            for (int i = 0; i < treasureChest.size(); i++) {
                countGains += treasureChest.get(i).length();

            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", countGains * 1.00 / treasureChest.size());
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
