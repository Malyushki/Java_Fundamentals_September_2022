import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> plantRarityMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> plantRatingMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            plantRarityMap.putIfAbsent(input[0], 0);
            plantRarityMap.put(input[0],Integer.parseInt(input[1]));
            plantRatingMap.putIfAbsent(input[0], new ArrayList<>());
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")){
            String[] commandType = command.split(":\\s+");
            switch (commandType[0]){
                case "Rate":
                    String plant = commandType[1].split(" - ")[0];
                    double plantRating = Double.parseDouble(commandType[1].split(" - ")[1]);
                    if (plantRatingMap.containsKey(plant)){
                        plantRatingMap.get(plant).add(plantRating);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String plantUpdate = commandType[1].split(" - ")[0];
                    int newRarity = Integer.parseInt(commandType[1].split(" - ")[1]);
                    if (plantRarityMap.containsKey(plantUpdate)){
                        plantRarityMap.put(plantUpdate,newRarity);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String plantReset = commandType[1].split(" - ")[0];
                    if (plantRatingMap.containsKey(plantReset)){
                     plantRatingMap.get(plantReset).clear();
                     plantRatingMap.get(plantReset).add(0.0);
                    }else {
                        System.out.println("error");
                    }

                    break;
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : plantRatingMap.entrySet()) {
            double sum = 0;
            int count = 0;
            for (Double e:entry.getValue()) {
                sum +=e;
                count++;
            }
            double averageSum = sum/count;
            entry.getValue().clear();
            entry.getValue().add(averageSum);
        }
   /*     for (Map.Entry<String, List<Double>> entry : plantRatingMap.entrySet()) {
            System.out.println(entry.getValue().get(0));

        }

    */

    }
}
