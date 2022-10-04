import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String commands = scanner.nextLine();
        while (!commands.equals("end")){
            String [] commandType = commands.split(" ");
            if (commandType[0].equals("Add")){
                wagons.add(Integer.parseInt(commandType[1]));
            }else {
                for (int i = 0; i <wagons.size() ; i++) {
                    if (wagons.get(i)+Integer.parseInt(commandType[0])<=maxCapacity){
                        wagons.set(i,(wagons.get(i)+Integer.parseInt(commandType[0])));
                        break;
                    }
                }
            }
            commands = scanner.nextLine();
        }
        for (int i = 0; i < wagons.size(); i++) {
            System.out.print(wagons.get(i)+" ");
        }
    }
}
