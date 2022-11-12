import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String encryptedMassage = scanner.nextLine();

        String regex = "@(?<name>[A-Za-z]+)[^!@:>-]*(?<behavior>![GN]!)";
        Pattern pattern = Pattern.compile(regex);

        while (!encryptedMassage.equals("end")) {
            StringBuilder massage = new StringBuilder();
            for (int i = 0; i < encryptedMassage.length(); i++) {
                char symbol = (char) (encryptedMassage.charAt(i) - n);
                massage.append(symbol);
            }
            Matcher matcher = pattern.matcher(massage);
            while (matcher.find()){
                String name = matcher.group("name");
                String behavior = matcher.group("behavior").replaceAll("!","");
                if (behavior.equals("G")){
                    System.out.println(name);
                break;
                }
            }

            encryptedMassage = scanner.nextLine();
        }
    }
}