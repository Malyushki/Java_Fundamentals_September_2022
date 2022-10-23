import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numberOfCommands; i++) {
            String command = scanner.nextLine();
            if (command.contains("Include")) {
                String include = command.split(" ")[1];
                coffeeList.add(include);
            } else if (command.contains("Remove first")) {
                int numberOfC = Integer.parseInt(command.split(" ")[2]);
                if (numberOfC < coffeeList.size()) {
                    for (int j = 0; j < numberOfC; j++) {
                        coffeeList.remove(0);
                    }
                }
            } else if (command.contains("Remove last")) {
                int numberOfC = Integer.parseInt(command.split(" ")[2]);
                if (numberOfC < coffeeList.size()) {
                    Collections.reverse(coffeeList);
                    for (int j = 0; j < numberOfC; j++) {
                        coffeeList.remove(0);
                    }
                    Collections.reverse(coffeeList);
                }
            } else if (command.contains("Prefer")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                if (index1 < coffeeList.size() && index2 < coffeeList.size()) {
                    String coffeeNameIndex1 = coffeeList.get(index1);
                    String coffeeNameIndex2 = coffeeList.get(index2);
                    coffeeList.set(index1, coffeeNameIndex2);
                    coffeeList.set(index2, coffeeNameIndex1);

                }
            } else if (command.contains("Reverse")) {
                Collections.reverse(coffeeList);
            }
        }
        System.out.println("Coffees:");
        System.out.println(coffeeList.toString().replaceAll("[\\[\\],]", ""));

    }
}
