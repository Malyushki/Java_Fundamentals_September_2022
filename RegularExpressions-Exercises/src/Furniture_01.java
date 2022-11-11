import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String redex = ">>(?<furniture>[A-z]+)<<(?<price>[0-9.]+)!(?<quantity>[0-9]+)\\b";
        Pattern pattern = Pattern.compile(redex);
        double totalMoney = 0;
        List<String> items = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("Purchase")) {
            Matcher orderMatcher = pattern.matcher(command);
            while (orderMatcher.find()) {
                items.add(orderMatcher.group("furniture"));
                double price = Double.parseDouble(orderMatcher.group("price"));
                double quantity = Double.parseDouble(orderMatcher.group("quantity"));
                totalMoney = totalMoney + price * quantity;
            }
            command = scanner.nextLine();
        }
     //   if (items.size() > 0) {
            System.out.println("Bought furniture:");
            for (String item : items) {
                System.out.println(item);
            }
      //  }
        System.out.printf("Total money spend: %.2f", totalMoney);

    }
}
