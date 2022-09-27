import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int countSequence = 1;
        int countSequenceMax = 0;
        int equalElements = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length - 1; i++) {
            if (numArr[i] == numArr[i + 1]) {
                countSequence++;
                if (countSequence > countSequenceMax) {
                    countSequenceMax = countSequence;
                    equalElements = numArr[i];
                }
            } else {
                countSequence = 1;
            }
        }
        for (int i = 1; i <= countSequenceMax; i++) {
            System.out.print(equalElements + " ");
        }

    }
}
