import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        getPow(num,power);

    }
    static void getPow(double num, int power){
        double result = Math.pow(num,power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }
}
