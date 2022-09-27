import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int line = 1; line <= n; line++) {
            int a = 1;
            for (int j = 1; j <= line; j++) {
                System.out.print(a + " ");
                a = a * (line - j) / j;
            }
            System.out.println();
        }
    }
}
