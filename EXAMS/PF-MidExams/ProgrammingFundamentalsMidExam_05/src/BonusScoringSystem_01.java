import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxBonusAttendance = 0;
        double totalBonus = 0;
        for (int i = 1; i <= numberOfStudents; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            if (lectures!=0) {
                 totalBonus = attendance * 1.00 / lectures * (5 + additionalBonus);
            }
            if (totalBonus>maxBonus){
                maxBonus = totalBonus;
                maxBonusAttendance = attendance;

            }
        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",maxBonusAttendance);
    }
}
