package randomize_words_01;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Random random = new Random();
        while (!words.isEmpty()){
            String randomWord = words.get(random.nextInt(words.size()));
            System.out.println(randomWord);
            words.remove(randomWord);
        }
    }
}
