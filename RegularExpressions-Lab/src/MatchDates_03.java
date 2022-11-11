import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String redex = "\\b(?<day>[0-9]{2})([.\\/-])(?<month>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})\\b";
        Pattern pattern = Pattern.compile(redex);
        Matcher dateMatcher = pattern.matcher(scanner.nextLine());
        while (dateMatcher.find()){
            String date = dateMatcher.group("day");
            String month = dateMatcher.group("month");
            String year = dateMatcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",date,month,year);

        }
    }
}
