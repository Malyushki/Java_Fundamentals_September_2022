import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int memoryNumber = 0;
        String command = "";
        while (!command.equals("end")) {
            String[] input = scanner.nextLine().split(" ");
            command = input[0];
            switch (command) {
                case "swap":
                    memoryNumber = numArr[Integer.parseInt(input[1])];
                    numArr[Integer.parseInt(input[1])] = numArr[Integer.parseInt(input[2])];
                    numArr[Integer.parseInt(input[2])] = memoryNumber;
                    break;
                case "multiply":
                    numArr[Integer.parseInt(input[1])] = numArr[Integer.parseInt(input[1])] * numArr[Integer.parseInt(input[2])];
                    break;
                case "decrease":
                    for (int i = 0; i < numArr.length; i++) {
                        numArr[i]--;
                    }
            }
        }
        for (int i = 0; i < numArr.length - 1; i++) {
            System.out.print(numArr[i] + ", ");
        }
        System.out.print(numArr[numArr.length - 1]);
    }
}

