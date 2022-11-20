import java.util.*;

public class NeedForSpeedIII_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Integer>> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\|");
            String carType = inputData[0];
            int carMileage = Integer.parseInt(inputData[1]);
            int carFuel = Integer.parseInt(inputData[2]);
            if (!carMap.containsKey(carType)) {
                carMap.putIfAbsent(carType, new ArrayList<>());
                carMap.get(carType).add(0);
                carMap.get(carType).add(0);
            }
            carMap.get(carType).set(0, carMileage);
            carMap.get(carType).set(1, carFuel);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandType = command.split(" : ");
            String carKey = commandType[1];
            switch (commandType[0]) {
                case "Drive":

                    int distance = Integer.parseInt(commandType[2]);
                    int fuel = Integer.parseInt(commandType[3]);
                    if (carMap.get(carKey).get(1) < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {

                        int currentMileage = carMap.get(carKey).get(0);
                        int currentFuel = carMap.get(carKey).get(1);
                        carMap.get(carKey).set(0, currentMileage + distance);
                        carMap.get(carKey).set(1, currentFuel - fuel);

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                , carKey, distance, fuel);
                    }
                    if (carMap.get(carKey).get(0) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", carKey);
                        carMap.remove(carKey);
                    }
                    break;

                case "Refuel":
                    int currentFuel = carMap.get(carKey).get(1);
                    int fuelToAdd = Integer.parseInt(commandType[2]);
                    if (currentFuel + fuelToAdd >= 75) {
                        fuelToAdd = 75 - currentFuel;
                        carMap.get(carKey).set(1, 75);
                    } else {
                        carMap.get(carKey).set(1, currentFuel + fuelToAdd);
                    }
                    System.out.printf("%s refueled with %d liters%n", carKey, fuelToAdd);
                    break;
                case "Revert":
                    int kilometersRevert = Integer.parseInt(commandType[2]);
                    int currentKilometers = carMap.get(carKey).get(0);
                    System.out.printf("%s mileage decreased by %d kilometers%n", carKey, kilometersRevert);
                    carMap.get(carKey).set(0, currentKilometers - kilometersRevert);
                    if (carMap.get(carKey).get(0) < 10000) {
                        carMap.get(carKey).set(0, 10000);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : carMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }


    }
}

