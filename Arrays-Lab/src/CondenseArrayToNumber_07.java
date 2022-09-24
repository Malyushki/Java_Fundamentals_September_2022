import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensed = new int[numbsArr.length - 1];
        int n = numbsArr.length-1;
        boolean iSCondensed = false;
        if (numbsArr.length == 1) {
            System.out.print(numbsArr[0]);
            iSCondensed = true;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < numbsArr.length-1; j++) {
                    condensed[j] = numbsArr[j] + numbsArr[j + 1];

                }
                numbsArr = new int[n];
                for (int j = 0; j < numbsArr.length ; j++) {

                    numbsArr[j] = condensed[j];
                }
            }
        }
        if (!iSCondensed){
            System.out.println(condensed[0]);
        }

    }
}



