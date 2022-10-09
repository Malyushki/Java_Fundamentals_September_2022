import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandType = command.split(" ");
            switch (commandType[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(commandType[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(commandType[2])>=0 && Integer.parseInt(commandType[2]) <numbers.size()) {
                        numbers.add(Integer.parseInt(commandType[2]), Integer.parseInt(commandType[1]));
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(commandType[1])>=0 && Integer.parseInt(commandType[1]) <numbers.size()) {
                        numbers.remove(Integer.parseInt(commandType[1]));
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                        switch (commandType[1]){
                            case "left":
                                for (int i = 1; i <=Integer.parseInt(commandType[2]) ; i++) {
                                    numbers.add(numbers.get(0));
                                    numbers.remove(0);
                                }
                                break;
                            case "right":
                                for (int i = 1; i <=Integer.parseInt(commandType[2]) ; i++) {
                                    numbers.add(0,numbers.get(numbers.size()-1));
                                    numbers.remove((numbers.size()-1));

                                }

                                break;
                        }
                    break;

            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
    }
}
