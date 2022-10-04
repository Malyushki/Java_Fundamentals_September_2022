import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputAll = scanner.nextLine();
        List<String> input = Arrays.stream(inputAll.split("\\|")).collect(Collectors.toList());
        List<String> inside = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.get(i).length()-1; j++) {
                inside.set(j, String.valueOf(input.get(i).charAt(j)));
            }
        }

        System.out.println(inside);

    }
}
