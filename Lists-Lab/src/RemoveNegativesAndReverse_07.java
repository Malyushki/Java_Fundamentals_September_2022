import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> positive = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)>=0){
                positive.add(0,numbers.get(i));
            }
        }
        if (!positive.isEmpty()){
            System.out.println(positive.toString().replaceAll("[\\[\\],]",""));
        }else {
            System.out.println("empty");
        }
    }
}
