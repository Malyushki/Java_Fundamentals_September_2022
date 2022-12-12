import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "\\|(?<boss>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i <n ; i++) {
            String input  = scanner.nextLine() ;
            Matcher matcher = pattern.matcher(input);
          String bossName = "-1";
          String title = "-1";
          int strength = 0;
          int armor = 0;

            while (matcher.find()){
                bossName = matcher.group("boss");
                title = matcher.group("title");
                if (!bossName.equals("-1")){
                    System.out.printf("%s, The %s%n",bossName,title);
                    System.out.printf(">> Strength: %s%n",bossName.length());
                    System.out.printf(">> Armor: %s%n",title.length());
                }


            }
            if (bossName.equals("-1")) {
                System.out.println("Access denied!");
            }

        }




    }
}
