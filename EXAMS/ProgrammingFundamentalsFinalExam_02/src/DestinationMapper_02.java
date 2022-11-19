import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(=|\\/)(?<city>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        List<String> citiesList = new ArrayList<>();
        while (matcher.find()) {
            citiesList.add(matcher.group("city"));
        }
        String toPrint = String.join(", ", citiesList);
        System.out.printf("Destinations: %s%n", toPrint);
        toPrint = toPrint.replaceAll("[, ]", "");
        System.out.printf("Travel Points: %d", toPrint.length());


    }
}
