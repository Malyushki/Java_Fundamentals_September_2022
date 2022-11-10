import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> numbersMap = new TreeMap<>();

        for (double number : numbersArr) {
            if (!numbersMap.containsKey(number)) {
                numbersMap.put(number,1);
            }else {
                numbersMap.put(number,numbersMap.get(number)+1);
            }
        }
        DecimalFormat df = new DecimalFormat("#.#######");
        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%s -> %d%n",df.format(entry.getKey()),entry.getValue());
        }


    }
}
