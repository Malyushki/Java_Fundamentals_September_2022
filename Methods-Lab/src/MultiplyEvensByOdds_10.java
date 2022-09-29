import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumOfEven = getEvenSum(number);
        int sumOfOdd = getOddSum(number);
        System.out.println(getResult(sumOfEven,sumOfOdd));
    }

    static int getEvenSum(int number) {
        int sum = 0;
        while (number != 0) {
            int lastNumber = number % 10;
            if (number % 2 == 0) {
                sum += lastNumber;
            }
            number = number / 10;
        }
        return sum;
    }

    static int getOddSum(int number) {
        int sum = 0;
        while (number != 0) {
            int lastNumber = number % 10;
            if (number % 2 != 0) {
                sum += lastNumber;
            }
            number = number / 10;
        }
        return sum;
    }
    static int getResult(int numbEvens,int numberOdds){
        int result = numberOdds *numbEvens;
        return result;
    }
}