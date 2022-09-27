import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numArr.length ; i++) {
            for (int j = i+1; j < numArr.length ; j++) {
                if (numArr[i]+numArr[j]==magicSum){
                    System.out.println(numArr[i]+" "+numArr[j]);
                }
            }
        }
    }
}
