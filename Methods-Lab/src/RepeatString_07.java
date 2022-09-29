import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        repeat(result,n);

    }


    static void repeat(String result, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(result);
        }

    }
}
