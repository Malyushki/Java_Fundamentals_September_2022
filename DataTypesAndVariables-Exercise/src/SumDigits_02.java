import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        if (number<10 && number>-10){
            System.out.println(number);
        }else {
            String numberInString = String.valueOf(number);
            for (int i = 0; i <numberInString.length() ; i++) {
            sumOfDigits +=Integer.parseInt(String.valueOf(numberInString.charAt(i)));
            }
            System.out.println(sumOfDigits);
        }
    }
}
