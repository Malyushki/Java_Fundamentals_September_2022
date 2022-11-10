import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String [] wordsArr = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, Integer> wordCountMap = new LinkedHashMap<>();
        for (String word : wordsArr) {
            word = word.toLowerCase(Locale.ROOT);
            if (!wordCountMap.containsKey(word)){
                wordCountMap.put((word),1);
            }else {
                wordCountMap.put(word,wordCountMap.get(word)+1);
            }
        }
        List<String> oddElements = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
           if (entry.getValue()%2==1){
               oddElements.add(entry.getKey());
            }

        }

        System.out.println(oddElements.toString().replaceAll("[\\[\\]]",""));
    }
}
