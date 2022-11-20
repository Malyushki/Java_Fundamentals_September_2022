/*Three employees are working on the reception all day. Each of them can handle a different number of students per hour.
 Your task is to calculate how much time it will take to answer all the questions of a given number of students.
First, you will receive 3 lines with integers, representing the number of students that each employee can help per hour.
On the following line, you will receive students count as a single integer.
Every fourth hour, all employees have a break, so they don't work for an hour. It is the only break
for the employees, because they don't need rest, nor have a personal life. Calculate the time needed
 to answer all the student's questions and print it in the following format: "Time needed: {time}h."

Input	|Output
5       |
6       |
4       |
20	    |Time needed: 2h.
*/


import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmploy = Integer.parseInt(scanner.nextLine());
        int secondEmploy = Integer.parseInt(scanner.nextLine());
        int thirdEmploy = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int allEmployeesEfficiency = firstEmploy + secondEmploy + thirdEmploy;
        int hours = 0;
        int studentsAnswered = 0;
        int breaks = 0;
        while (studentsCount > studentsAnswered) {
            hours++;
            studentsAnswered += allEmployeesEfficiency;
            if (hours % 3 == 0 && (studentsCount - studentsAnswered) > 0) {
                breaks++;
            }
        }
        System.out.printf("Time needed: %dh.", hours + breaks);
    }
}
