import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (isTopNumber(i)){
                System.out.println(i);
            }
        }


    }

    static boolean isTopNumber(int number) {
        boolean isTop = false;
        boolean isDivisible = false;
        boolean hasOneOdd = false;
        int sumOfDigits = 0;
                while (number >= 1) {
                if (number % 2 != 0) {
                    hasOneOdd = true;
                }
                sumOfDigits +=number%10;
                number = number / 10;
            }
        if (sumOfDigits%8==0){
            isDivisible  = true;
        }else {
            isDivisible = false;
        }
        if (isDivisible && hasOneOdd){
            isTop = true;
        }else {
            isTop = false;
        }

        return isTop;
    }
}
