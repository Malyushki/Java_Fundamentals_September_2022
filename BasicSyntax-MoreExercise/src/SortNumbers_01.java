import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int [] numbers ={num1,num2,num3};
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (numbers[i]>maxNumber){
                maxNumber = numbers[i];
            }
            if (numbers[i]<minNumber){
                minNumber = numbers[i];
            }
        }
        System.out.println(maxNumber);
        System.out.println(num1+num2+num3-minNumber-maxNumber);
        System.out.println(minNumber);



    }
}
