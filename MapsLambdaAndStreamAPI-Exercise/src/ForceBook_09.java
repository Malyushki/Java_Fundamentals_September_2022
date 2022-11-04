import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> theForce = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains(" | ")) {
                String forceSide = command.split(" | ")[0];
                String forceUser = command.split(" | ")[1];
                theForce.putIfAbsent(forceSide, new ArrayList<>());

                if (!theForce.containsValue(forceUser)) {
                    theForce.get(forceSide).add(forceUser);
                }

            } else {
                String forceSide = command.split(" -> ")[1];
                String forceUser = command.split(" -> ")[0];
                theForce.putIfAbsent(forceSide, new ArrayList<>());
                if (!theForce.containsValue(forceUser)) {
                    theForce.get(forceSide).add(forceUser);

                }else {
                    theForce.remove()
                }
            }


            command = scanner.nextLine();
        }
    }
}
