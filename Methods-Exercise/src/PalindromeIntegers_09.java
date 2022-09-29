import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){
            System.out.println(isPalindrome(input));
            input =scanner.nextLine();
        }
    }
    static boolean isPalindrome (String input){
        String backwardInput = "";
        for (int i = 0; i < input.length(); i++) {
            backwardInput += input.charAt(input.length()-i-1);

        }
        return (input.equals(backwardInput));
    }
}
