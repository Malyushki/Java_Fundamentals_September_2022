import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        for (String name : text) {
            if (name.length() <= 3 || name.length() > 16) {
                text.set(text.indexOf(name), "#");

            } else {
                boolean toRemove = false;
                for (int i = 0; i < name.length(); i++) {
                    if (!Character.isLetterOrDigit(name.charAt(i))) {
                        if (name.charAt(i) != '-' && name.charAt(i) != '_') {
                            toRemove = true;

                        }
                    }
                }
                if (toRemove) {
                    text.set(text.indexOf(name), "#");
                }
            }
        }

        for (String username : text) {
            if (!username.equals("#")) {
                System.out.println(username);
            }
        }

    }
}
