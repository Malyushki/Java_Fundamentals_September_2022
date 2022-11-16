import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().replaceAll("\\s+", "").split(",");
        String regex = "[^@#$^]{0,10}(?<code>[@#$^]{6,10})[^@#$^]{0,10}";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < input.length; i++) {
            StringBuilder currentTicket = new StringBuilder(input[i]);
            if (currentTicket.length()!=20){
                System.out.println("invalid ticket");
            }else {
                String leftSideTicket = currentTicket.substring(0,10);
                String rightSideTicket = currentTicket.substring(10,20);

              //  System.out.println(leftSideTicket);
               // System.out.println(rightSideTicket);

                Matcher leftMatcher = pattern.matcher(leftSideTicket);
                Matcher rightMatcher = pattern.matcher(rightSideTicket);
                while (leftMatcher.find()){
                    String winningLeftCode = leftMatcher.group("code");
                    while (rightMatcher.find()){
                        String winningRightCode = rightMatcher.group("code");
                        if (winningRightCode.equals(winningLeftCode)) {
                            int countWiningSymbols = winningRightCode.length();
                            if (countWiningSymbols==10){
                                System.out.printf("ticket \"%s\" - 10%s Jackpot!%n",currentTicket,winningLeftCode.charAt(0));
                            }else {

                                System.out.printf("ticket \"%s\" - %d%s%n",currentTicket,countWiningSymbols,winningLeftCode.charAt(0));
                            }


                        }else {
                            System.out.printf("ticket \"%s\" - no match",currentTicket);
                        }
                    }

                }


            }

        }



    }
}

