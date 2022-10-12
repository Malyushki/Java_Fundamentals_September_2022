import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger factorialN = BigInteger.ONE;
        for (int i = n; i >0 ; i--) {
            factorialN = factorialN.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorialN);
    }
}
