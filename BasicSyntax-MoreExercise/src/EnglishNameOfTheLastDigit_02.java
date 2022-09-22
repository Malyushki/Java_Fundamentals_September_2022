import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String[] nameOfDigit = {"zero","one","two","three","four","five","six","seven","eight","nine"};
            int number = Integer.parseInt(scanner.nextLine());
            int code = (number%10);
        System.out.println(nameOfDigit[code]);
    }
}
