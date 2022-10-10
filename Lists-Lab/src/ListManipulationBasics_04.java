import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandType = command.split(" ");
            switch (commandType[0]) {
                case "Add":
                    numbers.add(commandType[1]);
                    break;
                case "Remove":
                    numbers.remove(commandType[1]);
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(commandType[1]));
                 break;
                case "Insert":
                numbers.add(Integer.parseInt(commandType[2]),commandType[1]);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replace("["," ").replace(",","").replace("]"," "));
    }
}
