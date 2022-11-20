import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] commandType = command.split(":\\|:");
            switch (commandType[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandType[1]);
                    concealedMessage.insert(index, " ");
                    System.out.println(concealedMessage.toString());
                    break;
                case "Reverse":
                    String substringReverse = commandType[1];
                    if (concealedMessage.toString().contains(substringReverse)) {
                        int indexOfSubstring = concealedMessage.indexOf(substringReverse);
                        concealedMessage.replace(indexOfSubstring, substringReverse.length() + indexOfSubstring, "");
                        StringBuilder reverseSub = new StringBuilder(substringReverse);
                        reverseSub.reverse();
                        concealedMessage.append(reverseSub);

                        System.out.println(concealedMessage.toString());

                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringOld = commandType[1];
                    String replacement = commandType[2];
                    if (concealedMessage.toString().contains(substringOld)) {
                        concealedMessage = new StringBuilder(concealedMessage.toString().replaceAll(substringOld, replacement));
                    }
                    System.out.println(concealedMessage.toString());
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + concealedMessage.toString());
    }
}
