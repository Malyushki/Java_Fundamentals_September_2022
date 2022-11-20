import java.util.Arrays;
import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder encryptedMassage = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandType = command.split("\\|");
            switch (commandType[0]) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandType[1]);
                    for (int i = 0; i < numberOfLetters; i++) {
                        char letter = encryptedMassage.charAt(0);
                        encryptedMassage.replace(0, 1, "");
                        encryptedMassage.append(letter);

                    }
                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(commandType[1]);
                    String value = commandType[2];
                    encryptedMassage.insert(insertIndex, value);
                        break;
                case "ChangeAll":
                    String substring = commandType[1];
                    String replacement = commandType[2];
                    while (encryptedMassage.toString().contains(substring)) {
                        encryptedMassage = new StringBuilder(encryptedMassage.toString().replace(substring, replacement));

                        break;
                    }
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+encryptedMassage.toString());
    }
}
