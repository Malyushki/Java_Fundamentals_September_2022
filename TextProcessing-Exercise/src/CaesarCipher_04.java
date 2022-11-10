import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String text = scanner.nextLine();
        String encryptedText = encryptText(text);
        System.out.println(encryptedText);

    }
    static String encryptText(String text){
      String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
             char symbol = (char) (text.charAt(i) + 3);
            encryptedText +=symbol;
        }

        return encryptedText;
    }
}
