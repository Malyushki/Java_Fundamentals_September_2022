import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String str1 = input.split("\\s+")[0];
        String str2 = input.split("\\s+")[1];
        int sum = sumOfChars(str1, str2);
        System.out.println(sum);

    }

    static int sumOfChars(String str1, String str2) {
        int sum = 0;
        if (str2.length() > str1.length()) {
            String strTemp = str2;
            str2 = str1;
            str1 = strTemp;
        }
        for (int i = 0; i < str2.length(); i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }
        if (str1.length() > str2.length()) {
            for (int i = str2.length(); i < str1.length(); i++) {
                sum += str1.charAt(i);
            }
        }
        return sum;
    }
}

