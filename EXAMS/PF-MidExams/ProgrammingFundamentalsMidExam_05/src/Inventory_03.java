import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!commands.equals("Craft!")) {
            String[] commandParts = commands.split(" - ");
            switch (commandParts[0]) {
                case "Collect":
                    if (!itemsList.contains(commandParts[1])) {
                        itemsList.add(commandParts[1]);
                    }
                    break;
                case "Drop":
                    if (itemsList.contains(commandParts[1])) {
                        itemsList.remove(commandParts[1]);
                    }
                    break;
                case "Combine Items":
                    String[] itemsToCombine = commandParts[1].split(":");
                    String oldItem = itemsToCombine[0];
                    String newItem = itemsToCombine[1];
                    if (itemsList.contains(oldItem)) {
                        int index = itemsList.indexOf(oldItem) + 1;
                        itemsList.add(index, newItem);
                    }
                    break;
                case "Renew":
                    if (itemsList.contains(commandParts[1])) {
                        int index = itemsList.indexOf(commandParts[1]);
                        itemsList.add(commandParts[1]);
                        itemsList.remove(index);
                    }
                    break;
            }


            commands = scanner.nextLine();
        }
        System.out.println(Arrays.toString(itemsList.toArray()).replace("[", "").replace("]", ""));
    }
}

