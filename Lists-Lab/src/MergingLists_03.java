import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> combined = new ArrayList<>();

        while (numbers1.size() > 0 && numbers2.size() > 0) {
            combined.add(numbers1.get(0));
            combined.add(numbers2.get(0));
            numbers1.remove(0);
            numbers2.remove(0);

        }
        if (numbers1.size() > 1) {
            for (int i = 0; i < numbers1.size(); i++) {
                combined.add(numbers1.get(i));

            }
        }
        if (numbers2.size() > 1) {
            for (int i = 0; i < numbers2.size(); i++) {
                combined.add(numbers2.get(i));

            }
        }
        System.out.println(combined.toString());
    }
}
