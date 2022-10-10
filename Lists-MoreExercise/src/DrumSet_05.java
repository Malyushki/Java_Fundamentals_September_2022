import java.util.*;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumsQualities = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumsDuplicate = new ArrayList<>(drumsQualities);
        String command = scanner.nextLine();
            while (!command.equals("Hit it again, Gabsy!")) {
                int power = Integer.parseInt(command);
                int sizeOfList = drumsQualities.size();
                for (int i = 0; i < sizeOfList; i++) {

                    if ((power >= drumsQualities.get(i))) {
                        int initiallyQuality = drumsDuplicate.get(i);
                        double price = initiallyQuality * 3;
                        if (price <= savings) {
                            drumsQualities.set(i, initiallyQuality);
                            savings -= price;
                        } else {
                            drumsQualities.remove(i);
                            drumsDuplicate.remove(i);
                            i -= 1;
                            sizeOfList -= 1;
                        }
                    } else {
                        int currentQuality = drumsQualities.get(i) - power;
                        drumsQualities.set(i, currentQuality);
                    }

                }

            command = scanner.nextLine();
        }
        System.out.println(drumsQualities.toString().replaceAll("[\\[\\],]",""));
        System.out.printf("Gabsy has %.2flv.",savings);
    }
}
