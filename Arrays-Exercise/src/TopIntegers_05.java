import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isBigger = true;
        for (int i = 0; i < numbArr.length; i++) {
            for (int j = i+1; j < numbArr.length; j++) {
                if (numbArr[i] > numbArr[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;

                }
            }
            if (isBigger) {
                System.out.print(numbArr[i] + " ");
            }
            isBigger = true;
        }
    }
}
