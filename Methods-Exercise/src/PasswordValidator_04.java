import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        checkPass(input);


    }

    static void checkPass(String input) {
        int count = 0;
        boolean isValid = true;
        if (input.length() < 6 || input.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol < 47 || symbol > 57) {

                if (symbol < 65 || symbol > 90) {
                    if (symbol < 97 || symbol > 122) {
                        System.out.println("Password must consist only of letters and digits");
                        isValid = false;
                        break;
                    }
                }
            }else {
                count++;
            }
        }
        if (count < 1) {
            isValid = false;
            System.out.println("Password must have at least 2 digits");
        }
        if (isValid) {
            System.out.println("Password is valid");
        }
    }
}
