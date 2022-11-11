import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "[STARstar]";
        Pattern pattern = Pattern.compile(regex);
        List<String> destroyedPlanetsList = new ArrayList<>();
        List<String> attackedPlanetsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String encryptedMassage = scanner.nextLine();
            Matcher countStars = pattern.matcher(encryptedMassage);
            int count = 0;
            while (countStars.find()) {
                count++;
            }

            char[] encryptedMassageArr = encryptedMassage.toCharArray();
            String message = "";
            for (char symbol : encryptedMassageArr) {
                message += (char) (symbol - count);
            }
            String redex2 = "@(?<planetName>[A-Za-z]+)([^@\\-!:>]*):(?<populationCount>\\d+)([^@\\-!:>]*)!(?<attackType>[AD])!([^@\\-!:>]*)->(?<soldiersCount>\\d+)";
            Pattern extractInfo = Pattern.compile(redex2);
            Matcher extractInfoMatcher = extractInfo.matcher(message);
            while (extractInfoMatcher.find()){
                String planetName = extractInfoMatcher.group("planetName");
                String attackType = extractInfoMatcher.group("attackType");
               if (attackType.equals("A")){
                   attackedPlanetsList.add(planetName);
                }else {
                   destroyedPlanetsList.add(planetName);
               }

            }
        }
        Collections.sort(attackedPlanetsList);
        Collections.sort(destroyedPlanetsList);
        System.out.printf("Attacked planets: %d%n",attackedPlanetsList.size());
        if (attackedPlanetsList.size()>0){
            for (String attackedPlanets:attackedPlanetsList) {
                System.out.printf("-> %s%n",attackedPlanets);
        }
        }
        System.out.printf("Destroyed planets: %d%n",destroyedPlanetsList.size());
        if (destroyedPlanetsList.size()>0){
            for (String destroyedPlanets:destroyedPlanetsList) {
                System.out.printf("-> %s%n",destroyedPlanets);
            }
        }

    }
}
