import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double priceOrder = 0;
        double total = 0;

        for (int i = 1; i <=n ; i++) {
            double pricePerCoffee = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules  = Integer.parseInt(scanner.nextLine());
            priceOrder = days*pricePerCoffee*capsules;
            System.out.printf("The price for the coffee is: $%.2f%n",priceOrder);
            total += priceOrder;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
