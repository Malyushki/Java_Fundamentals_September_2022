import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> combined = new ArrayList<>();
        List<Integer> mixed = new ArrayList<>();
        int min = 0;
        int max = 0;


        if (list1.size() < list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                combined.add(list1.get(i));
                combined.add(list2.get(list2.size() - 1 - i));
            }
            list2=list2.subList(0,2);
            Collections.sort(list2);
            min = list2.get(0);
            max = list2.get(1);
        } else {
            for (int i = 0; i < list2.size(); i++) {
                combined.add(list1.get(i));
                combined.add(list2.get(list2.size() - 1 - i));
            }
           list1 = list1.subList(list1.size()-2,list1.size());
            Collections.sort(list1);
            min = list1.get(0);
            max = list1.get(1);
        }
        for (int i = 0; i < combined.size(); i++) {
            if (combined.get(i)>min && combined.get(i)<max){
                mixed.add(combined.get(i));
            }
        }
        Collections.sort(mixed);
        System.out.println(mixed.toString().replaceAll("[\\[\\],]",""));
    }
}
