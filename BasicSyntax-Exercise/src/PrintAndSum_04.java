import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fromNum = Integer.parseInt(scanner.nextLine());
        int toNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = fromNum; i <=toNum ; i++) {
            System.out.print(i  + " ");
            sum+=i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
