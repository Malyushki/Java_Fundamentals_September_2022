import java.util.*;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, List<Integer>> citiesMap = new LinkedHashMap<>();
        while (!input.equals("Sail")) {
            String city = input.split("[|]{2}")[0];
            int population = Integer.parseInt(input.split("[|]{2}")[1]);
            int gold = Integer.parseInt(input.split("[|]{2}")[2]);
            //  System.out.println(city+" - "+population+" - "+gold);
            if (!citiesMap.containsKey(city)) {
                citiesMap.putIfAbsent(city, new ArrayList<>());
                citiesMap.get(city).add(population);
                citiesMap.get(city).add(gold);
                // Локация лист индекс 0 --> популация
                // Локация лист индекс 1 --> злато

            } else {
                int currentPopulation = citiesMap.get(city).get(0);
                int currentGold = citiesMap.get(city).get(1);
                citiesMap.get(city).set(0, currentPopulation + population);
                citiesMap.get(city).set(1, currentGold + gold);

            }

            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandType = command.split("=>");
            String town = commandType[1];
            int currentPopulation = citiesMap.get(town).get(0);
            int currentGold = citiesMap.get(town).get(1);
            switch (commandType[0]) {
                case "Plunder":

                    int people = Integer.parseInt(commandType[2]);
                    int gold = Integer.parseInt(commandType[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                    citiesMap.get(town).set(0, currentPopulation - people);
                    citiesMap.get(town).set(1, currentGold - gold);

                    if (citiesMap.get(town).get(0) <= 0 || citiesMap.get(town).get(1) <= 0) {
                        citiesMap.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int goldProsper = Integer.parseInt(commandType[2]);
                    if (goldProsper<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldProsper,town,currentGold + goldProsper);
                        citiesMap.get(town).set(1, currentGold + goldProsper);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (!citiesMap.isEmpty()){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",citiesMap.size());
            for (Map.Entry<String, List<Integer>> entry : citiesMap.entrySet()) {
                String city = entry.getKey();
                int people = entry.getValue().get(0);
                int gold = entry.getValue().get(1);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",city,people,gold);
            }

        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
