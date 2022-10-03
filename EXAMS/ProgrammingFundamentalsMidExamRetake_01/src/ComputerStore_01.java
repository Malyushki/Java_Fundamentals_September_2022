import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double orderPrice = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);

            if (price < 0) {
                System.out.println("Invalid price!");

            } else {
                orderPrice += price;
            }
            input = scanner.nextLine();
        }
        if (orderPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", orderPrice);
            System.out.printf("Taxes: %.2f$%n", orderPrice * 0.2);
            System.out.println("-----------");
            if (input.equals("special")) {
                System.out.printf("Total price: %.2f$", (orderPrice * 1.2 * 0.9));
            } else {
                System.out.printf("Total price: %.2f$", (orderPrice * 1.2));
            }
        }
    }
}
