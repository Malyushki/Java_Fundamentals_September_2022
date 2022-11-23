import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawKeyText = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] commandType = command.split(">>>");
            switch (commandType[0]) {
                case "Contains":
                    String substringContains = commandType[1];
                    if (rawKeyText.contains(substringContains)) {
                        System.out.printf("%s contains %s%n", rawKeyText, substringContains);

                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    boolean toLower = (commandType[1].equals("Lower"));
                    int startIndex = Integer.parseInt(commandType[2]);
                    int endIndex = Integer.parseInt(commandType[3]);
                    rawKeyText = flipKey(rawKeyText,startIndex,endIndex,toLower);
                    System.out.println(rawKeyText);
                    break;
                case "Slice":
                    int startIndexDelete = Integer.parseInt(commandType[1]);
                    int endIndexDelete = Integer.parseInt(commandType[2]);
                    StringBuilder sb = new StringBuilder();
                    sb = new StringBuilder(rawKeyText);
                    sb.delete(startIndexDelete,endIndexDelete);
                    rawKeyText = sb.toString();
                    System.out.println(rawKeyText);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + rawKeyText);
    }

    public static String flipKey(String rawKey, int startIndex, int endIndex, boolean flipLower) {
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder(rawKey);
        sb.delete(startIndex, endIndex);

        if (flipLower) {
            rawKey = rawKey.substring(startIndex, endIndex).toLowerCase(Locale.ROOT);
        } else {
            rawKey = rawKey.substring(startIndex, endIndex).toUpperCase(Locale.ROOT);
        }
        sb.insert(startIndex, rawKey);
return sb.toString();
    }
}
