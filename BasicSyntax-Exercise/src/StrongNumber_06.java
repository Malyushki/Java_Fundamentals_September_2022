import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        int number = 0;
        int multiplyNumber = 1;
        int sum = 0;
        for (int i = 0; i <numbers.length() ; i++) {
            number = Integer.parseInt(String.valueOf(numbers.charAt(i)));
            for (int j = 1; j <=number ; j++) {
                multiplyNumber=j*multiplyNumber;
            }
            sum +=multiplyNumber;
            multiplyNumber = 1;
        }
        if (sum==Integer.parseInt(numbers)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
