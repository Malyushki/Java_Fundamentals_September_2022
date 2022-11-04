package students_2_6;
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

            if (isStudentExisting(studentList,commandArr[0],commandArr[1])){
Student student = Student.getStudent(studentList,commandArr[0],commandArr[1]);
student.setFirstName(commandArr[0]);
student.setLastName(commandArr[1]);
student.setAge(commandArr[2]);
student.setCity(commandArr[3]);
            }else {
                Student student = new Student(commandArr[0], commandArr[1], commandArr[2], commandArr[3]);
                studentList.add(student);
            }
            command = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getCity().equals(cityName)) {
                System.out.println(student.toString());
            }
        }

    }

    public static boolean isStudentExisting(List<Student> student, String firstName, String lastName) {
        for (Student e : student) {
            if (e.getFirstName().equals(firstName) && e.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}