import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();
        String symbol = scanner.nextLine();

        System.out.printf("%s%s%s",nameOne,symbol,nameTwo);
    }
}
