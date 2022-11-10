import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        StringBuilder remove = new StringBuilder(second);
        while (second.contains(first)) {
            int start = remove.indexOf(first);
            if (start >= 0) {
                remove.replace(start, (start + first.length()), "");
            }
            second = String.valueOf(remove);
        }
        System.out.println(second);
    }
}
