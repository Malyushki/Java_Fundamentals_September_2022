import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        returnArea(a, b);

    }

    static void returnArea(int a, int b) {
        int sum = a * b;
        System.out.println(sum);
    }
}
