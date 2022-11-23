import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regexEmoji = "(?<emoji>([:]{2}|[*]{2})[A-Z][a-z]{2,}\\2)";
        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = patternEmoji.matcher(input);

        String regexDigits = "\\d";
        Pattern patternDigits = Pattern.compile(regexDigits);
        Matcher matcherDigits = patternDigits.matcher(input);

        List<String> emojisList = new ArrayList<>();
        List<Integer> numb = new ArrayList<>();


        while (matcherEmoji.find()){
            emojisList.add(matcherEmoji.group("emoji"));
        }
       // emojisList.forEach(System.out::println);
        while (matcherDigits.find()){
            numb.add(Integer.parseInt(matcherDigits.group()));

        }
        int coolThresholdSum = 1;
        for (int i = 0; i <numb.size() ; i++) {
            coolThresholdSum = coolThresholdSum*numb.get(i);

        }
        System.out.println("Cool threshold: "+coolThresholdSum);
        System.out.printf("%s emojis found in the text. The cool ones are:%n",emojisList.size());
        for (String e:emojisList) {
            int coolValue = 0;
            for (int i = 0; i <e.length() ; i++) {
                char symbol = e.charAt(i);
                if (Character.isLetter(symbol)) {
                    coolValue += symbol;
                 //  System.out.println(symbol +" - "+coolValue);
                }
            }

            if (coolValue>coolThresholdSum){
                System.out.println(e);
            }
        }
    }

}
