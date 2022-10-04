import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        int power = Integer.parseInt(command[1]);
        int startIndex = 0;
        int endIndex = 0;
        while (sequence.contains(Integer.parseInt(command[0]))) {
            int index = sequence.indexOf(Integer.parseInt(command[0]));
            if (index - power < 0) {
                startIndex = 0;
            } else {
                startIndex = index - power;
            }
            if (index + power > sequence.size() - 1) {
                endIndex = sequence.size() - 1;
            } else {
                endIndex = index + power;
            }
            for (int i = startIndex; i <= endIndex; i++) {
                sequence.remove(startIndex);
            }
        }
            int sum = 0;
            for (int i = 0; i < sequence.size(); i++) {
                sum += sequence.get(i);
            }
            System.out.println(sum);
        }
    }
