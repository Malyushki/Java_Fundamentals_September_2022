import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, double[]> ordersMap = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("buy")) {
            String name = command.split("\\s+")[0];
            double price = Double.parseDouble(command.split("\\s+")[1]);
            int quantity = Integer.parseInt(command.split("\\s+")[2]);
            ordersMap.putIfAbsent(name, new double[2]);
            ordersMap.get(name)[0]=price;
            ordersMap.get(name)[1]= ordersMap.get(name)[1]+ quantity;


            command = scanner.nextLine();
        }

        for (Map.Entry<String, double[]> entry : ordersMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue()[0] * entry.getValue()[1]);
        }

    }
}
