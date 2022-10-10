import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < numbers.size(); i++) {
            int index = 0;
            int memoryNumber = numbers.get(i);

            while (memoryNumber != 0) {
                index += memoryNumber % 10;
                memoryNumber = memoryNumber / 10;
            }
            while (index > text.length()) {
                index -= text.length();
            }
            System.out.print(sb.charAt(index));
            sb.deleteCharAt(index);

        }
    }
}
