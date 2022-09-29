import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        gradeIt(input);
    }

    static void gradeIt(double input) {
        String[] grades = {"Fail", "Poor", "Good", "Very good", "Excellent"};
        if (input >= 2 && input < 3) {
            System.out.println(grades[0]);
        } else if (input >= 3 && input < 3.5) {
            System.out.println(grades[1]);
        } else if (input >= 3.5 && input < 4.5) {
            System.out.println(grades[2]);
        } else if (input >= 4.5 && input < 5.5) {
            System.out.println(grades[3]);
        } else if (input >= 5.5 && input < 6) {
            System.out.println(grades[4]);
        }
    }
}