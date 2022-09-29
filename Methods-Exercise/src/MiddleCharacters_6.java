import java.util.Scanner;

public class MiddleCharacters_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String text = getMiddleCharacter(input);

    }


    static String getMiddleCharacter(String input) {
        int index = 0;

        if (input.length() % 2 == 0) {
            index = input.length() / 2;
            for (int i = index - 1; i <= index; i++) {
                System.out.print(input.charAt(i));
            }
        } else {
            index = input.length() / 2;
            System.out.println(input.charAt(index));
        }

        return input;
    }
}
