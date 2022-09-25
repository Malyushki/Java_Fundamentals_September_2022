import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        for (String value : secondArr) {
            for (String s : firstArr) {
                if (s.equals(value)) {
                    System.out.print(s + " ");
                }
            }
        }

    }
}
