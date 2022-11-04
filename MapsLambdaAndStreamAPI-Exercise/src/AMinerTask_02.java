import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String,Double> materialsMap = new LinkedHashMap<>();
        while (!command.equals("stop")){
            String resource = command;
            double quantities = Double.parseDouble(scanner.nextLine());
            materialsMap.putIfAbsent(resource,0.0);
            materialsMap.put(resource,materialsMap.get(resource)+quantities);
            command = scanner.nextLine();

        }
        for (Map.Entry<String, Double> entry : materialsMap.entrySet()) {
            System.out.printf("%s -> %.0f%n",entry.getKey(),entry.getValue());
        }

    }
}
