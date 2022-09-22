import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalProduct = 0;
        int count = 0;
        while (startingYield >= 100) {
            count++;
            totalProduct += startingYield;
            totalProduct -= 26;
            startingYield -= 10;
        }
        if (totalProduct>=26){
            totalProduct-=26;
        }
        System.out.println(count);
        System.out.println(totalProduct);
    }
}
