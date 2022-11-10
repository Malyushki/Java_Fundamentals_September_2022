import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String bWord : bannedWords) {
            String replacement = "";
            for (int i = 0; i <bWord.length() ; i++) {
                replacement +="*";
            }
           text =  text.replaceAll(bWord,replacement);
        }
        System.out.println(text);
    }

}
