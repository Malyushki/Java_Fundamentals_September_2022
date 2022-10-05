import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrays = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String[] commandType = command.split(" ");
            switch (commandType[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(commandType[1]);
                    int endIndex = Integer.parseInt(commandType[2]);
                    String newCode = "";
                    if (startIndex<0){
                        startIndex = 0;
                    }
                    if (startIndex>arrays.size()-1){
                        break;
                    }
                    if (endIndex<0){
                        break;
                    }
                    if (endIndex>arrays.size()-1){
                        endIndex = arrays.size()-1;
                    }
                    for (int i = startIndex; i <=endIndex ; i++) {
                        newCode+= arrays.get(i);
                    }
                    for (int i = startIndex; i <=endIndex ; i++) {
                        arrays.remove(startIndex);
                    }

                    arrays.add(startIndex,newCode);
                    break;
                case "divide":
                    int index = Integer.parseInt(commandType[1]);
                    int partitions = Integer.parseInt(commandType[2]);
                   while (arrays.get(index).length()%partitions!=0)



                    // if (arrays.get(index).length()%partitions!=0){
                     //
                    //}
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println(arrays);
    }
}
