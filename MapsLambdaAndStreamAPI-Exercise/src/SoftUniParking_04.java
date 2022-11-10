import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parkingMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            switch (input[0]) {
                case "register":
                    String username = input[1];
                    String licensePlateNumber = input[2];
                    if (parkingMap.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    } else {
                        parkingMap.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }
                    break;
                case "unregister":
                    String usernameUnregister = input[1];
                    if (!parkingMap.containsKey(usernameUnregister)) {
                        System.out.printf("ERROR: user %s not found%n", usernameUnregister);
                    } else {
                        parkingMap.remove(usernameUnregister, parkingMap.get(usernameUnregister));
                        System.out.printf("%s unregistered successfully%n", usernameUnregister);
                    }
                    break;
            }
        }


        for (Map.Entry<String, String> entry : parkingMap.entrySet()) {
            PrintStream printf = System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());

        }
    }
}
