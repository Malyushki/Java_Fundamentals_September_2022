import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([@#])(?<word>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> word1List = new ArrayList<>();
        List<String> word2List = new ArrayList<>();
        List<String> forPrint = new ArrayList<>();
        int count = 0;
        while (matcher.find()){
            word1List.add( matcher.group("word"));
            word2List.add( matcher.group("word2"));
        }
        for (int i = 0; i <word1List.size() ; i++) {
            StringBuilder backward = new StringBuilder(word2List.get(i));
            backward.reverse();
            count++;
            if (word1List.get(i).equals(backward.toString())){
                forPrint.add(String.join(" <=> ",word1List.get(i),word2List.get(i)));

            }
        }
            if (count>0) {
                System.out.println(count + " word pairs found!");
            }else {
                System.out.println("No word pairs found!");
            }

        if (!forPrint.isEmpty()) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", forPrint));
        }else {
            System.out.println("No mirror words!");
        }
    }
}
