import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] demonsArr = scanner.nextLine().replaceAll("\\s+","").split(",");
        String regexHealth =    "[^\\d\\+\\-.\\/*]";
        String regexDamage =    "(-?\\d+\\.?\\d*)";

        Pattern patternHealth = Pattern.compile(regexHealth);
        Pattern patternDamage = Pattern.compile(regexDamage);

        for (int i = 0; i < demonsArr.length; i++) {
            String currentDemon = demonsArr[i];
            int health = 0;
            double damage = 0;

            Matcher healthMatcher = patternHealth.matcher(currentDemon);
            while (healthMatcher.find()){
              String temp =  (healthMatcher.group()) ;
                health +=(char) temp.charAt(0);
            }
            Matcher damageMatcher = patternDamage.matcher(currentDemon);
             while (damageMatcher.find()){
                 damage +=Double.parseDouble(damageMatcher.group());
             }
            for (int j = 0; j < currentDemon.length(); j++) {
                char symbol = currentDemon.charAt(j);
                switch (symbol){
                    case '*':
                        damage = damage*2;
                        break;
                    case '/':
                        damage = damage/2;
                        break;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n",currentDemon,health,damage);


        }




    }
}
