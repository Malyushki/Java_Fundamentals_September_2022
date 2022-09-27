import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum = 0;
        boolean elementExists = false;
        if (numbArr.length == 1) {
            System.out.println(0);
        } else {
            for (int i = 0; i < numbArr.length; i++) {
                for (int j = i + 1; j < numbArr.length; j++) {
                    rightSum += numbArr[j];
                }
                for (int j = 0; j < i; j++) {
                    leftSum += numbArr[j];
                }
                if (leftSum == rightSum) {
                    System.out.println(i);
                    elementExists = true;
                }
                leftSum = 0;
                rightSum = 0;

            }
            if (!elementExists) {
                System.out.println("no");
            }
        }
    }
}
