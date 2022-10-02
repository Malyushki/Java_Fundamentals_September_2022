import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] commands = scanner.nextLine().split(" ");
        while (!commands[0].equals("end")){
            switch (commands[0]){
                case "swap":
                    int memoryNumber =numbArr[Integer.parseInt(commands[1])] ;
                    numbArr[Integer.parseInt(commands[1])] = numbArr[Integer.parseInt(commands[2])];
                    numbArr[Integer.parseInt(commands[2])] = memoryNumber;
                    break;
                case "multiply":
                    numbArr[Integer.parseInt(commands[1])]
                            = numbArr[Integer.parseInt(commands[2])]*numbArr[Integer.parseInt(commands[1])];
break;
                case "decrease":
                    for (int i = 0; i < numbArr.length; i++) {
                        numbArr[i]--;
                    }
            }
            commands = scanner.nextLine().split(" ");
        }
        System.out.println(Arrays. toString(numbArr).replace("[","").replace("]",""));
    }
}
