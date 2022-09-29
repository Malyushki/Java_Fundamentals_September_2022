import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        calculateOrder(product,quantity);
    }

    static void calculateOrder(String product ,int quantity){
        double sum = 0;
        switch (product){
            case "coffee":
                sum  = quantity * 1.5;
                break;
            case "water":
                sum  = quantity;
                break;
            case "coke":
                sum  = quantity * 1.4;
                break;
            case "snacks":
                sum  = quantity * 2;
                break;
        }
        System.out.printf("%.2f",sum);
    }

}
