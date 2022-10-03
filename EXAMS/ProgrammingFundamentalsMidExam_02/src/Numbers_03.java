import java.util.*;
import java.util.stream.Collectors;


public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newNumbers = new ArrayList();
        double averageSum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            averageSum += numbers.get(i);
        }
        averageSum = averageSum / numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > averageSum) {
                newNumbers.add(numbers.get(i));
            }
        }
        newNumbers.sort(Collections.reverseOrder());
        if (newNumbers.size() == 0) {
            System.out.println("No");
        }else {
            int count = 0;
            for (int i = 0; i < newNumbers.size(); i++) {
                if (count<5){
                    System.out.print(newNumbers.get(i) + " ");
                    count++;
                }
            }
        }

    }
}
