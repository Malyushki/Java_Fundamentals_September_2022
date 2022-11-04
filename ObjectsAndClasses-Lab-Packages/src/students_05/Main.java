package students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            Student student = new Student(commandArr[0], commandArr[1], commandArr[2], commandArr[3]);
            studentList.add(student);
            command = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getCity().equals(cityName)) {
                System.out.println(student.toString());
            }
        }

    }
}
