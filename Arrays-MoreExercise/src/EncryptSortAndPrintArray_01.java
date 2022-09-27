import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];
        int[] encryptNames = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
            for (int j = 0; j < names[i].length(); j++) {
                char symbol = names[i].charAt(j);
                switch (symbol) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        encryptNames[i] += names[i].charAt(j) * names[i].length();
                        break;
                    default:
                        encryptNames[i] += names[i].charAt(j)/ names[i].length();
                        break;
                }

            }
        }
        Arrays.sort(encryptNames);
        for (int j = 0; j < encryptNames.length; j++) {
            System.out.println(encryptNames[j]);

        }
    }
}
