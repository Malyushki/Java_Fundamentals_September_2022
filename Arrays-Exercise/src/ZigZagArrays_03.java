import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        int countRotation = 0;
        for (int i = 0; i < n; i++) {
            countRotation++;

            if (countRotation % 2 != 0) {
                firstArr[i] = scanner.nextInt();
                secondArr[i] = scanner.nextInt();
            } else {
                secondArr[i] = scanner.nextInt();
                firstArr[i] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        for (int j : firstArr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i : secondArr) {
            System.out.print(i + " ");
        }
    }
}
