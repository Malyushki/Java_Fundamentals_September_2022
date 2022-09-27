import java.util.Scanner;

public class RecursiveFibonacci_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] fibArr = new int[n];
        fibArr[0] = 1;
        if (fibArr.length>1){
            fibArr[1] = 1;
        }
        if (fibArr.length>2){
            for (int i = 2; i <n ; i++) {
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
            }
        }
        System.out.println(fibArr[n-1]);
    }
}
