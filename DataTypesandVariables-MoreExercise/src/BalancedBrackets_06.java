import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countLeft = 0;
        int countRight = 0;
        boolean isBalanced = true;
        for (int i = 1; i <= n - 1; i++) {
            if (input.equals("(")) {
                countLeft++;
                if (countLeft - countRight > 1) {
                    isBalanced = false;
                }
            }
            if (input.equals(")")) {
                countRight++;
                if (countRight > countLeft) {
                    isBalanced = false;
                }
            }
            input = scanner.nextLine();
        }
        if (countLeft != countRight) {
            isBalanced = false;
        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
