import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        numbers[0] = Integer.parseInt(scanner.nextLine());
        numbers[1] = Integer.parseInt(scanner.nextLine());
        numbers[2] = Integer.parseInt(scanner.nextLine());
        numbers[3] = Integer.parseInt(scanner.nextLine());
        int sum = (numbers[0] + numbers[1]) / numbers[2] * numbers[3];
        System.out.println(sum);

    }
}
