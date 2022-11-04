import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String word  =scanner.nextLine().replaceAll("[\\s+]","");
        LinkedHashMap<Character,Integer> countCharsMap = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            countCharsMap.putIfAbsent(word.charAt(i), 0);
            countCharsMap.put(word.charAt(i),countCharsMap.get(word.charAt(i))+1);
        }

        for (Map.Entry<Character, Integer> entry : countCharsMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
