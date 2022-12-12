import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String [] commandType = command.split(" ");
            int index = Integer.parseInt(commandType[1]);
            switch (commandType[0]){
                case "Shoot":
                    int powerReduce = Integer.parseInt(commandType[2]);
                    if (index>=0 && index<targets.size()) {

                        if (targets.get(index) > powerReduce) {
                            targets.set(index,(targets.get(index)- powerReduce));
                        }else {
                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commandType[2]);
                    if (index>=0 && index<targets.size()){
                        targets.add(index,value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commandType[2]);
                    if (index-radius>=0 && index+radius<targets.size()){
                        targets.subList((index-radius), (index+radius+1)).clear();

                    }else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            command=scanner.nextLine();
        }
        for (int i = 0; i < targets.size()-1; i++) {
            System.out.print(targets.get(i)+"|");
        }
        System.out.println(targets.get(targets.size()-1));
    }
}
