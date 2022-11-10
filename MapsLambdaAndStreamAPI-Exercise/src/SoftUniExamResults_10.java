import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> studentMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissionsMap = new LinkedHashMap<>();
        while (!input.equals("exam finished")) {
            if (!input.contains("banned")) {
                String username = input.split("-")[0];
                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);
                studentMap.putIfAbsent(username, 0);
                if (studentMap.get(username) <= points && studentMap.get(username) != -1) {
                    studentMap.put(username, points);
                }
                submissionsMap.putIfAbsent(language, 0);
                submissionsMap.put(language, submissionsMap.get(language) + 1);
            } else {
                String username = input.split("-")[0];

                studentMap.putIfAbsent(username, -1);
                studentMap.put(username, -1);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            if (entry.getValue() >= 0) {
                System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissionsMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}
