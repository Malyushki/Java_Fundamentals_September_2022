import java.util.*;

public class TakeSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();
        List<Integer> take = new ArrayList<>();
        List<String> massageList = new ArrayList<>();
        StringBuilder text = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                numbersList.add(Integer.parseInt(String.valueOf((text.charAt(i)))));
            } else {
                massageList.add(String.valueOf((text.charAt(i))));
            }
        }
        for (int i = 0; i < numbersList.size(); i++) {
            if (i % 2 == 0) {
                take.add(numbersList.get(i));
            } else {
                skip.add(numbersList.get(i));
            }
        }
        int count = 0;
        String hiddenMassage = "";
        while (take.size() - 1 >= count) {
            int takeN = take.get(count);
            int skipN = skip.get(count);
            for (int i = 0; i < takeN; i++) {
                if (massageList.isEmpty()) {
                    break;
                } else {
                    hiddenMassage += massageList.get(0);
                    massageList.remove(0);
                }
            }
            for (int i = 0; i < skipN; i++) {
                if (massageList.isEmpty()) {
                    break;
                } else {
                    massageList.remove(0);
                }
            }
            count++;
        }
        System.out.println(hiddenMassage);
    }
}
