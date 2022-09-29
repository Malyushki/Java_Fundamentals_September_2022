import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(sum(num1,num2),num3));
    }
    static int sum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    static int subtract (int sum,int num3){
        sum = sum - num3;
        return sum;
    }
}
