import java.util.*;
import java.util.stream.Collectors;

public class Students_04 {
    static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return firstName +" "+ lastName +": " +String.format("%.2f",grade);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String[]inputStudentInfo = scanner.nextLine().split("\\s+");
            Student currentStudent = new Student(inputStudentInfo[0],inputStudentInfo[1],Double.parseDouble(inputStudentInfo[2]));
            studentList.add(currentStudent);
        }
List<Student> sortedStudentsList = studentList.stream().sorted(Comparator.comparing(Student::getGrade)).collect(Collectors.toList());
Collections.reverse(sortedStudentsList);
        for (Student e:sortedStudentsList) {
            System.out.println(e.toString());

        }

    }
}
