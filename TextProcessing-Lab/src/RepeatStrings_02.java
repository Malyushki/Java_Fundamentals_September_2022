import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] wordsArr = scanner.nextLine().split("\\s+");

        for (String word: wordsArr) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i <word.length() ; i++) {
                result.append(word);

            }
            System.out.print(result);
        }
    }
}
