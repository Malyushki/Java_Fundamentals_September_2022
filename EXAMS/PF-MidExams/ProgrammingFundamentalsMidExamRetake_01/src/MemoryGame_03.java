import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbersMemory = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        int count = 1;
        boolean wonGame = false;
        while (!command[0].equals("end")) {

            int firstIndex = Integer.parseInt(command[0]);
            int secondIndex = Integer.parseInt(command[1]);
            if (firstIndex == secondIndex || firstIndex >= numbersMemory.size() || secondIndex >= numbersMemory.size() ||
                    firstIndex < 0 || secondIndex < 0) {
                int middle = numbersMemory.size() / 2;
                numbersMemory.add(middle, String.valueOf(-count) + 'a');
                numbersMemory.add(middle, String.valueOf(-count) + 'a');
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                if (numbersMemory.get(firstIndex).equals(numbersMemory.get(secondIndex))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", numbersMemory.get(firstIndex));
                    if (firstIndex > secondIndex) {
                        numbersMemory.remove(firstIndex);
                        numbersMemory.remove(secondIndex);
                    } else {
                        numbersMemory.remove(secondIndex);
                        numbersMemory.remove(firstIndex);
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            if (numbersMemory.isEmpty()) {
                wonGame = true;
                System.out.printf("You have won in %d turns!", count);
                break;
            } else {
                count++;
                command = scanner.nextLine().split(" ");
            }
        }

        if (!wonGame) {
            System.out.println("Sorry you lose :(");
            for (int i = 0; i < numbersMemory.size(); i++) {
                System.out.print(numbersMemory.get(i) + " ");
            }
        }
    }
}

