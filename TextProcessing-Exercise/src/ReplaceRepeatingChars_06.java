import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder endText = new StringBuilder("");

        for (int i = 1; i <text.length() ; i++) {
            if (i==1) {
                endText.append(text.charAt(0));
            }
            char symbol = text.charAt(i - 1);
            if (text.charAt(i) != symbol) {
                endText.append(text.charAt(i));
            }
        }
            System.out.println(endText);

    }
}
