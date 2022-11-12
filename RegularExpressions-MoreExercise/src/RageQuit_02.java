import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toUpperCase(Locale.ROOT);
        String regex = "(?<massage>\\D+)(?<repeat>\\d*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder rageMassage = new StringBuilder();
        while (matcher.find()){
            String massage = matcher.group("massage");
            int repeat = Integer.parseInt(matcher.group("repeat"));

                for (int j = 0; j < repeat; j++) {
                    rageMassage.append(massage);
                }
        }
        System.out.printf("Unique symbols used: %d%n",rageMassage.chars().distinct().count());
        System.out.println(rageMassage);

    }
}
