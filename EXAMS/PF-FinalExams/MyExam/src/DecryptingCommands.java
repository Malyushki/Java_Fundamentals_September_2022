import java.util.Locale;
import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String text = scanner.nextLine();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Finish")){
            String[] commandType = inputLine.split("\\s+");
            switch (commandType[0]){
                case "Replace":
                    String currentChar = commandType[1];
                    String newChar = commandType[2];
                    if (text.contains(currentChar)){
                        text =  text.replaceAll(currentChar,newChar);
                        System.out.println(text);
                    }
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandType[1]);
                    int endIndex = Integer.parseInt(commandType[2])+1;
                    if (startIndex>=0  && endIndex < text.length()-1){
                        StringBuilder cutText = new StringBuilder(text);
                        int indexOfSB = cutText.indexOf( text.substring(startIndex,endIndex));
                        cutText.replace(indexOfSB,endIndex,"");
                        text = cutText.toString();
                        System.out.println(text);

                    }else {
                        System.out.println("Invalid indices!");
                    }
                case "Make":
                    if (commandType[1].equals("Upper")){
                        text = text.toUpperCase();
                        System.out.println(text);
                    }else if (commandType[1].equals("Lower")){
                        text = text.toLowerCase();
                        System.out.println(text);
                    }

                    break;
                case "Check":
                    String textCheck = commandType[1];
                    if (text.contains(textCheck)){
                        System.out.printf("Message contains %s%n",textCheck);
                    }else {
                        System.out.printf("Message doesn't contain %s%n",textCheck);
                    }
                    break;
                case "Sum":
                    int sumStartIndex = Integer.parseInt(commandType[1]);
                    int sumEndIndex = Integer.parseInt(commandType[2])+1;
                    int sumValue = 0;
                    if (sumStartIndex>=0  && sumEndIndex < text.length()-1){
                        String toSum = text.substring(sumStartIndex,sumEndIndex);
                        for (int i = 0; i <toSum.length() ; i++) {
                            char symbol = toSum.charAt(i);
                            sumValue+=symbol;
                        }
                        System.out.println(sumValue);
                    }else {
                        System.out.println("Invalid indices!");
                    }

                    break;


            }


            inputLine=scanner.nextLine();
        }

    }
}

