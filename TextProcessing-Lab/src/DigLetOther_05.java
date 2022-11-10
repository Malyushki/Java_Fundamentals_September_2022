    import java.util.Scanner;

    public class DigLetOther_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    System.out.print(text.charAt(i));
                }
            }
            System.out.println();
                for (int i = 0; i < text.length(); i++) {
                    if (Character.isLetter(text.charAt(i))){
                        System.out.print(text.charAt(i));
                    }
            }
            System.out.println();
            for (int i = 0; i < text.length(); i++) {
                if (!Character.isLetterOrDigit(text.charAt(i))){
                    System.out.print(text.charAt(i));
                }
            }
        }
    }
