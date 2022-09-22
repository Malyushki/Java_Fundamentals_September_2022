import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            boolean isInt = true;
            try {
                int intNumb = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInt = false;
            }
            boolean isDouble = true;
            try {
                double doubleNumb = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }
            if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (isInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);

            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
