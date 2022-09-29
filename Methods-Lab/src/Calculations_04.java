import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                add(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
        }

    }

    static void add(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        System.out.println(sum);
    }
    static void multiply(int num1, int num2) {
        int sum = 0;
        sum = num1 * num2;
        System.out.println(sum);
    }
    static void subtract(int num1, int num2) {
        int sum = 0;
        sum = num1 - num2;
        System.out.println(sum);
    }
    static void divide(int num1, int num2) {
        int sum = 0;
        sum = num1 / num2;
        System.out.println(sum);
    }
}
