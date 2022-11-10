import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<String> items = new ArrayList<>();
        List<Double> price = new ArrayList<>();
        List<Integer> quantity = new ArrayList<>();
        Double totalPrice = 0.0;
        while (!command.equals("Purchase")) {
            if (command.contains("<<")&&command.contains(">>")&&command.contains("!")) {
                String[] order = command.replaceAll("[<<!]", " ").replaceAll("[>>]", "")
                        .split("\\s+");

                if (order.length == 3) {
                    items.add(order[0]);
                    price.add(Double.parseDouble(order[1]));
                    quantity.add(Integer.parseInt(order[2]));
                }
            }
            command = scanner.nextLine();
        }


        System.out.println("Bought furniture:");
        if (items.size() > 0) {
            for (int i = 0; i < items.size(); i++) {
                totalPrice += price.get(i) * quantity.get(i);
            }
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i));
            }
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }

}

