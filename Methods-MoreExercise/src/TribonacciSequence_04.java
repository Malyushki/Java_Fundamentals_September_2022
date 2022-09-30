import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        getTribonacci(n);

    }

    static void getTribonacci(int n) {
        int[] sequence = new int[n];
        sequence[0] = 1;
        for (int i = 1; i < n; i++) {
            if (i > 2) {
                sequence[i] = sequence[i - 1] + sequence[i - 2] + sequence[i - 3];

            }else if (i == 2) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];

            }else if (i == 1) {
                sequence[i] = sequence[i - 1];

            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(sequence[i] + " ");
        }
    }

}
