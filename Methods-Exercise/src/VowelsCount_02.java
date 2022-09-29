import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(getVowsCount(word));

    }
    static int getVowsCount (String word){
        int count = 0;
        for (int i = 0; i < word.length() ; i++) {
            char symbol = word.toLowerCase().charAt(i);
            switch (symbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
               count ++;
            }
        }
    return count;
    }
}
