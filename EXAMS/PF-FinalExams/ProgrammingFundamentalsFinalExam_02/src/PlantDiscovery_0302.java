import java.util.*;

public class PlantDiscovery_0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Plants> plantMap = new LinkedHashMap<>(); //map с class Plants

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            if (!plantMap.containsKey(input[0])) {
                plantMap.put(input[0], new Plants());
            }
            plantMap.get(input[0]).setRarity(Integer.parseInt(input[1]));
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandType = command.split(": ");
            switch (commandType[0]) {
                case "Rate":
                    String plant = commandType[1].split(" - ")[0];
                    double plantRating = Double.parseDouble(commandType[1].split(" - ")[1]);
                    if (plantMap.containsKey(plant)) {
                        plantMap.get(plant).addRating(plantRating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String plantUpdate = commandType[1].split(" - ")[0];
                    int newRarity = Integer.parseInt(commandType[1].split(" - ")[1]);
                    if (plantMap.containsKey(plantUpdate)) {
                        plantMap.get(plantUpdate).setRarity(newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String plantReset = commandType[1].split(" - ")[0];
                    if (plantMap.containsKey(plantReset)) {
                        plantMap.get(plantReset).removeRating();
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Plants> entry : plantMap.entrySet()) {
            String plantName = entry.getKey();
            int rarity = entry.getValue().getRarity();
            double averageRating = entry.getValue().getAverageRating(entry.getValue().getRating());

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRating);
        }
    }
}

class Plants {
    private int rarity;
    private List<Double> rating = new ArrayList<>();

    public int getRarity() {
        return rarity;
    }

    public List<Double> getRating() {
        return rating;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }


    public void addRating(double rating) {
        this.rating.add(rating);
    }

    public void removeRating() {
        this.rating.clear();

    }

    public double getAverageRating(List<Double> rating) {
        double sum = 0;
        int count = 0;
        for (Double rate : rating) {
            count++;
            sum += rate;
        }
        if (count != 0) {

            return sum / count;
        } else {
            return 0;
        }

    }
}
