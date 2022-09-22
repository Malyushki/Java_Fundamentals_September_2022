import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            double [] numbers = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            boolean firstIsBigger = numbers[0]>numbers[1];
            while (numbers[0]!=0){
                sumA += Math.abs(numbers[0]%10);
                numbers[0] = Math.abs(numbers[0]/10);
            }
            while (numbers[1]!=0){
                sumB += Math.abs(numbers[1]%10);
                numbers[1] = Math.abs(numbers[1]/10);
            }
            if(firstIsBigger){
                System.out.println(sumA);
            }else {
                System.out.println(sumB);
            }
            sumA = 0;
            sumB = 0;
            }

        }
    }

