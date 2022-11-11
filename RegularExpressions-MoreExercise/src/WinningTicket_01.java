import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().replaceAll("\\s+","").split(",");
        String regex = "(?<leftSide>([@#$^]){6,10})[^ ]*(?<rightSide>\\1)";
        boolean isMatch = false;
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < input.length; i++) {
            isMatch = false;
            String currentTicket = input[i];
            if (currentTicket.length()<20){
                System.out.println("invalid ticket");
                isMatch = true;
            }else {
                Matcher matcher = pattern.matcher(currentTicket);
                while (matcher.find()) {
                    String leftSide = matcher.group("leftSide");
                    String rightSide = matcher.group("rightSide");
                    int size = leftSide.length();
                    char symbol = leftSide.charAt(0);
                    if (size == 10) {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", currentTicket, size, symbol);
                        isMatch = true;
                        break;
                    } else {
                        System.out.printf("ticket \"%s\" - %d%s%n", currentTicket, size, symbol);
                        isMatch = true;
                        break;
                    }
                }
                    if (!isMatch){
                        System.out.printf("ticket \"%s\" - no match",currentTicket);

                    }
                }
            }

        }

    }

