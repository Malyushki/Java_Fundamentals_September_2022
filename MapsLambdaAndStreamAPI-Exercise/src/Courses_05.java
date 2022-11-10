import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> coursesMap = new LinkedHashMap<>();
        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];
            coursesMap.putIfAbsent(courseName, new ArrayList<>());
            coursesMap.get(courseName).add(studentName);
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue().size());
            for (String name: entry.getValue()) {
                System.out.println("-- "+name);
            }
        }

    }
}
