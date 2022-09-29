import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numbOne = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double numbTwo = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(getCalculation(numbOne, operator, numbTwo)));
    }

    static double getCalculation(double firstNumb, String operator, double secondNumb) {
        double sum = 0;
        switch (operator) {
            case "/":
                sum = firstNumb / secondNumb;
                break;
            case "*":
                sum = firstNumb * secondNumb;
                break;
            case "+":
                sum = firstNumb + secondNumb;
                break;
            case "-":
                sum = firstNumb - secondNumb;
                break;
        }
        return sum;
    }
}
