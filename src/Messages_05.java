import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int numOfDigits = 0;
        int mainDigit = 0;
        String sms = "";
        char symbol = ' ';
        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            numOfDigits = input.length();
            mainDigit = Integer.parseInt(input)%10;
            if (mainDigit>7){
                symbol = (char) ((97 + (mainDigit - 2) * 3)+numOfDigits);
            }else {
                symbol = (char) ((97 + (mainDigit - 2) * 3)+numOfDigits-1);
            }
            if (mainDigit==0){
                symbol = ' ';
            }
            sms+=symbol;
        }
        System.out.println(sms);







    }
}
