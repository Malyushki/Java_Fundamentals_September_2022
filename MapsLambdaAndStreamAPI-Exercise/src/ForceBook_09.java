import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, List<String>> theForce = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains(" | ")) {
                String forceSide = command.split(" \\| ")[0];
                String forceUser = command.split(" \\| ")[1];
                theForce.putIfAbsent(forceSide, new ArrayList<>());

                if (!isContained(theForce, forceUser)) {
                    theForce.get(forceSide).add(forceUser);
                }

            } else {
                String forceSide = command.split(" -> ")[1];
                String forceUser = command.split(" -> ")[0];
                theForce.putIfAbsent(forceSide, new ArrayList<>());
                if (!isContained(theForce, forceUser)) {
                    theForce.get(forceSide).add(forceUser);


                } else {
                    theForce.values().removeIf(v->v.contains(forceUser));

                    //map.values().removeIf(v -> v.equals(myValue));
                    theForce.get(forceSide).add(forceUser);

                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : theForce.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (String name : entry.getValue()) {
                    System.out.printf("! %s%n", name);
                }
            }
        }

    }

    static boolean isContained(LinkedHashMap<String, List<String>> map, String user) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String name : entry.getValue()) {
                if (name.equals(user)) {
                    return true;

                }
            }
        }
        return false;
    }
}
