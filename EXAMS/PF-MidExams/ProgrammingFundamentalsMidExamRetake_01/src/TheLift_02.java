import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] liftArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < liftArr.length; i++) {
            if (liftArr[i] < 4) {
                int emptySpace = 4 - liftArr[i];
                if (peopleWaiting > 0 && peopleWaiting >= emptySpace) {
                    liftArr[i] += emptySpace;
                    peopleWaiting -= emptySpace;
                } else if (peopleWaiting > 0 && peopleWaiting < emptySpace) {
                    liftArr[i] += peopleWaiting;
                    peopleWaiting -= peopleWaiting;
                }
            }
        }
        if (peopleWaiting > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
        } else if (liftArr[liftArr.length - 1] <= 3) {
            System.out.println("The lift has empty spots!");
        }

        for (int i = 0; i < liftArr.length; i++) {
            System.out.print(liftArr[i] + " ");
        }
    }
}
