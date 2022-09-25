import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbArr = Arrays
                .stream(scanner.nextLine().split( " "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        int memoryNumber = 0;
        for (int i = 0; i <rotations ; i++) {
            memoryNumber = numbArr[0];
            for (int j = 0; j < numbArr.length-1; j++) {
                numbArr[j]=numbArr[j+1];
            }
            numbArr[numbArr.length-1] = memoryNumber;
        }

        for (int j : numbArr) {
            System.out.print(j + " ");
        }
    }
}
