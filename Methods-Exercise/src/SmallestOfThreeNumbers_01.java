import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[3];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(getSmallest(numbers));



    }
    static int getSmallest (int[] numbers){
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (numbers[i]<smallestNumber){
                smallestNumber=numbers[i];
            }
        }
        return smallestNumber;
    }
    static int getBiggest (int[] numbers){
        int smallestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if (numbers[i]>smallestNumber){
                smallestNumber=numbers[i];
            }
        }
        return smallestNumber;
    }

}
