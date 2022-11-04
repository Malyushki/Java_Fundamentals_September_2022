import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = Arrays.stream(scanner.nextLine().split("\\s+")).filter(w->w.length()%2==0).toArray(String[]::new);


        for (String w: wordsArr) {
            System.out.println(w);
        }
    }

}
