import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        boolean areEqual = false;
        if (numbers1.length <= numbers2.length) {
            for (int i = 0; i < numbers1.length; i++) {
                if (numbers1[i] == numbers2[i]) {
                    sum += numbers1[i];
                    areEqual = true;
                } else {
                    areEqual = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                }
            }
        } else {
            for (int i = 0; i < numbers2.length; i++) {
                if (numbers1[i] == numbers2[i]) {
                    sum += numbers2[i];
                    areEqual = true;
                } else {
                    areEqual = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                }
            }
        }

        if (areEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
