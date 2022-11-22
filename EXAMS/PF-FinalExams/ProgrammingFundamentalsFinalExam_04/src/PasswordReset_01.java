import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] commands = input.split(" ");
            switch (commands[0]){
                case "TakeOdd":
                    StringBuilder textManipulation = new StringBuilder();
                    for (int i = 1; i <text.length() ; i+=2) {
                        char symbol = text.charAt(i);
                        textManipulation.append(symbol);
                    }
                    text = textManipulation.toString();
                    System.out.println(text);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    StringBuilder cutText = new StringBuilder(text);
                    int indexOfSB = cutText.indexOf( text.substring(index,index+length));
                    cutText.replace(indexOfSB,indexOfSB+length,"");
                    text = cutText.toString();
                    System.out.println(text);
                    break;
                case "Substitute":
                    String substring = commands[1];
                    String substitute = commands[2];

                    if (text.contains(substring)){
                    text = text.replace(substring,substitute);
                        System.out.println(text);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your password is: "+text);
    }
}
