import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {"Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 1 && number <= 7) {
            System.out.println(daysOfWeek[number]);
        }else {
            System.out.println(daysOfWeek[0]);
        }
    }
}
