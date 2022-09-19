import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrash = lostGamesCount / 2;
        int mouseTrash = lostGamesCount / 3;
        int keyboardTrash = lostGamesCount / 6;
        int displayTrash = lostGamesCount / 12;

        double totalExpenses = (headsetPrice * headsetTrash) + (mousePrice * mouseTrash)
                + (keyboardPrice * keyboardTrash) + (displayPrice * displayTrash);

        System.out.printf("Rage expenses: %.2f lv.",totalExpenses);
    }
}
