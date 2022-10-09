import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (!command[2].equals("not")) {
                if (!guestList.contains(command[0])) {
                    guestList.add(command[0]);
                } else {
                    System.out.printf("%s is already in the list!%n", command[0]);
                }
            } else {
                if (guestList.contains(command[0])) {
                    guestList.remove(command[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", command[0]);
                }
            }
        }
        for (String e : guestList
        ) {
            System.out.println(e);
        }
    }
}