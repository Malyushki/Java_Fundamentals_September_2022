import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phoneList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String [] commandType = command.split(" - ");
            switch (commandType[0]){
                case "Add":
                       String addPhone = commandType[1];
                       if (!phoneList.contains(addPhone)){
                           phoneList.add(addPhone);
                       }
                    break;
                case "Remove":
                    String removePhone = commandType[1];
                    if (phoneList.contains(removePhone)){
                        phoneList.remove(removePhone);
                    }
                    break;
                case "Bonus phone":
                    String oldPhone = commandType[1].split(":")[0];
                    String newPhone = commandType[1].split(":")[1];
                   if (phoneList.contains(oldPhone)){
                       int index = phoneList.indexOf(oldPhone)+1;
                       phoneList.add(index,newPhone);
                   }
                    break;
                case "Last":
                    String lastPhone = commandType[1];
                    if (phoneList.contains(lastPhone)){
                        phoneList.add(lastPhone);
                        phoneList.remove(lastPhone);
                    }
                    break;
            }
            command=scanner.nextLine();
        }
        System.out.println(phoneList.toString().replaceAll("[\\[\\]]",""));
    }
}
