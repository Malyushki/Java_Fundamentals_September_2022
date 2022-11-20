import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!commands.equals("Go Shopping!")) {
            String[] commandType = commands.split(" ");

            switch (commandType[0]) {
                case "Urgent":
                    if (!shoppingList.contains(commandType[1])){
                    shoppingList.add(0,commandType[1]);
                    }
                                 break;
                case "Unnecessary":
                    if (shoppingList.contains(commandType[1])){
                        shoppingList.remove(commandType[1]);
                        }
                    break;
                case "Correct":

                   if (shoppingList.contains(commandType[1])){
                       int index = shoppingList.lastIndexOf(commandType[1]);
                       shoppingList.add(index,commandType[2]);
                       shoppingList.remove(commandType[1]);
                   }
                    break;
                case "Rearrange":

                    if (shoppingList.contains(commandType[1])){
                        shoppingList.remove(commandType[1]);
                        shoppingList.add(commandType[1]);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println(Arrays.toString(shoppingList.toArray())
                .replace("[", "").replace("]", ""));

    }
}
