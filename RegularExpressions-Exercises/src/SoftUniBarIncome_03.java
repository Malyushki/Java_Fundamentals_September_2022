import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        String redex = "%(?<name>[A-Z][a-z]+)%([^|$%.]*)<(?<product>\\w+)>([^|$%.]*)\\|(?<count>[0-9]+)\\|([^|$%.1-9]*)(?<price>[0-9]+(\\.[0-9]+)?)\\$$";
        Pattern pattern = Pattern.compile(redex);
        double totalIncome = 0;
        while (!input.equals("end of shift")){
            Matcher validOrders = pattern.matcher(input);
            while (validOrders.find()){
                String name = validOrders.group("name");
                String product = validOrders.group("product");
              double total = Double.parseDouble(validOrders.group("count")) *
                      Double.parseDouble(validOrders.group("price"));
              totalIncome+=total;
                System.out.printf("%s: %s - %.2f%n",name,product,total);

            }


            input=scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
