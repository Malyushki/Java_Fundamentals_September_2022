import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getHometown() {
            return this.hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!command.equals("end")) {
            String[] studentInfo = command.split("\\s+");
            Student currentStudentInfo = new Student(studentInfo[0], studentInfo[1], Integer.parseInt(studentInfo[2]), studentInfo[3]);
            studentList.add(currentStudentInfo);
            command = scanner.nextLine();
        }
        String cityFilter = scanner.nextLine();
        for (Student e:studentList) {
            if (e.getHometown().equals(cityFilter)) {
                System.out.printf("%s %s is %d years old%n",e.getFirstName(),e.getLastName(),e.getAge());
            }
        }
    }
}
