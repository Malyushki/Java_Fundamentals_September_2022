import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsGradeMap = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentsGradeMap.putIfAbsent(name,new ArrayList<>());
            studentsGradeMap.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsGradeMap.entrySet()) {
            double avg = entry.getValue().stream().mapToDouble(Double::doubleValue).sum() / entry.getValue().size();
            if (avg>=4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), avg);
            }
        }

    }
}
