import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            char symbol =(char) (input.charAt(0)+key);
            System.out.print(symbol);
        }

    }
}
