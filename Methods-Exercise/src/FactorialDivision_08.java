import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",(getFactorialNumber(numb1)/getFactorialNumber(numb2)));
    }
    static double getFactorialNumber (int number){
        double factorialNumber = 1;
        for (int i = 1; i <=number ; i++) {
            factorialNumber =factorialNumber * i;
        }
        return factorialNumber;
    }
}
