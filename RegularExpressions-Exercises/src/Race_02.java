import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> racersMap = new TreeMap<>();
        String redexNames = "[A-Za-z+]";
        String redexDistance = "[0-9]";
        Pattern patternNames = Pattern.compile(redexNames);
        Pattern patternDistance = Pattern.compile(redexDistance);
        String[] racers = scanner.nextLine().split(", ");
        for (String name : racers) {
            racersMap.putIfAbsent(name, 0);
        }
        String command = scanner.nextLine();
        while (!command.equals("end of race")) {
            Matcher nameMatcher = patternNames.matcher(command);
            Matcher distanceMatcher = patternDistance.matcher(command);
            int distance = 0;
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group());

            }
            if (racersMap.containsKey(name.toString())) {
                while (distanceMatcher.find()) {

                    distance = Integer.parseInt(distanceMatcher.group()) + distance;

                }
                racersMap.put(name.toString(), racersMap.get(name.toString()) + distance);


            }


            command = scanner.nextLine();
        }
        List<String> playerList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int maxDistance = Integer.MIN_VALUE;
            String maxDistancePlayer = "";

            for (Map.Entry<String, Integer> entry : racersMap.entrySet()) {

                if (entry.getValue() >= maxDistance) {
                    maxDistancePlayer = entry.getKey();
                    maxDistance = entry.getValue();
                }

            }
            playerList.add(maxDistancePlayer);
           racersMap.put(maxDistancePlayer,0);
        }
        System.out.printf("1st place: %s%n",playerList.get(0));
        System.out.printf("2nd place: %s%n",playerList.get(1));
        System.out.printf("3rd place: %s%n",playerList.get(2));
    }


}
