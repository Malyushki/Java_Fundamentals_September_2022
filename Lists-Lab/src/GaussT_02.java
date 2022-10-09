import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussT_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        while (numbers.size() > 1) {
            int sum = numbers.get(0) + numbers.get(numbers.size() - 1);
            System.out.print(sum + " ");
            numbers.remove(0);
            numbers.remove((numbers.size() - 1));
        }
        if (numbers.size()==1){
            System.out.print(numbers.get(0));
        }
    }
}

