import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasuresChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String command = scanner.nextLine();
        boolean emptyChest = false;
        while (!command.equals("Yohoho!")) {
            String[] commandType = command.split(" ");
            switch (commandType[0]) {
                case "Loot":
                    for (int i = 1; i < commandType.length; i++) {
                        if (!treasuresChest.contains(commandType[i])) {
                            treasuresChest.add(0, commandType[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandType[1]);
                    if (index >= 0 && index < treasuresChest.size()) {
                        treasuresChest.add(treasuresChest.get(index));
                        treasuresChest.remove(index);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandType[1]);
                    if (count > treasuresChest.size() - 1) {
                        System.out.println(Arrays.toString(treasuresChest.toArray()).replace("[", "").replace("]", ""));
                        treasuresChest.clear();
                        emptyChest = true;
                    } else {
                        String[] removed = new String[count];
                        while (count > 0) {
                            removed[count - 1] = treasuresChest.get(treasuresChest.size() - 1);
                            treasuresChest.remove(treasuresChest.size() - 1);
                            count--;
                        }
                        System.out.println(Arrays.toString(removed).replace("[", "").replace("]", ""));
                    }
            }


            command = scanner.nextLine();
        }


        if (!emptyChest) {
            String sumCredits = Arrays.toString(treasuresChest.toArray())
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", "")
                    .replace(" ", "");
            System.out.printf("Average treasure gain: %.2f pirate credits.", sumCredits.length() * 1.00 / treasuresChest.size());
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
