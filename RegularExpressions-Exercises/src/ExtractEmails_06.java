import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "\\b(?<userName>\\w*\\d*[.\\-_]?\\w*\\d*)\\b@(?<host>(\\w*\\d*[.\\-_]?\\w*\\d*){1,})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String email = matcher.group();
            System.out.println(email);
        }
    }
}
