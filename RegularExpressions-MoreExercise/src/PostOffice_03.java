import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] massage = scanner.nextLine().split("\\|");
        String regexFirstPart = "([#$%*&])(?<firstPart>[A-Z]+)\\1";
        String regexSecondPart = "(?<firstLetter>6[5-9]|[78][0-9]|90):(?<length>\\d{2})";
        String[] massageList = massage[2].split("\\s+");
        Pattern patternFirst = Pattern.compile(regexFirstPart);
        Pattern patternSecond = Pattern.compile(regexSecondPart);
        Matcher letter = patternFirst.matcher(massage[0]);
        Matcher length = patternSecond.matcher(massage[1]);
        TreeMap<String, Integer> lettersLengthsMap = new TreeMap<>();
        String capitalLetters = "";



        while (length.find()) {
            lettersLengthsMap.put(Character.toString(Integer.parseInt(length.group("firstLetter"))), Integer.parseInt(length.group("length")) + 1);

        }
      while (letter.find()){
          capitalLetters = letter.group("firstPart");

        }

        for (int i = 0; i < capitalLetters.length(); i++) {
            char symbols = capitalLetters.charAt(i);
            int currentLength = lettersLengthsMap.get(String.valueOf(symbols));
            for (String element:massageList) {
                if (element.charAt(0)==symbols && element.length()==currentLength){

                    System.out.println(element);
            }


        }

        }
    }

}

