import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([#$%*&])(?<name>[A-Za-z]+)\\1=(?<lenghtGC>[0-9]+)[!]{2}(?<geoCode>.+)";
        String result = "Nothing found!";
        while (result.equals("Nothing found!")) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("name");
                int lengthGC = Integer.parseInt(matcher.group("lenghtGC"));
                String geoCode = matcher.group("geoCode");
                if (geoCode.length() == lengthGC) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i = 0; i < lengthGC; i++) {
                        stringBuilder.append((char) (geoCode.charAt(i) + lengthGC));

                    }
                    result = "";
                    geoCode = stringBuilder.toString();
                    System.out.printf("Coordinates found! %s -> %s%n", name, geoCode);
                }
            }
            if (!result.equals("")) {
                System.out.println(result);
            }
        }

    }


}

