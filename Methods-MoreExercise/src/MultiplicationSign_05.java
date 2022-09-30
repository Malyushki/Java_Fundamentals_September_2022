import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        getSign(num1,num2,num3);
    }

    static void getSign(int num1, int num2, int num3) {
        boolean isZero = false;
        boolean isNegative = false;
        int count = 0;
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            isZero = true;
        }
        if (Math.abs(num1) != num1) {
            count++;
        }
        if (Math.abs(num2) != num2) {
            count++;
        }
        if (Math.abs(num3) != num3) {
            count++;
        }
        if (count == 1 || count == 3) {
            isNegative = true;
        }
        if (isZero) {
            System.out.println("zero");
        }else if (isNegative) {
            System.out.println("negative");
        } else {
            System.out.println("positive");

        }
    }
}
