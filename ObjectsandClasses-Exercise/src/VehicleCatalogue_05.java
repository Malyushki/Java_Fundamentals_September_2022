import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {
    static class Vehicle {
        String typeOfVehicle;
        String modelOfVehicle;
        String colorOfVehicle;
        int horsepowerOfVehicle;

        public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
            this.typeOfVehicle = typeOfVehicle;
            this.modelOfVehicle = modelOfVehicle;
            this.colorOfVehicle = colorOfVehicle;
            this.horsepowerOfVehicle = horsepowerOfVehicle;
        }



        public String getTypeOfVehicle() {
            return this.typeOfVehicle;
        }

        public String getModelOfVehicle() {
            return this.modelOfVehicle;
        }

        public String getColorOfVehicle() {
            return this.colorOfVehicle;
        }

        public int getHorsepowerOfVehicle() {
            return this.horsepowerOfVehicle;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicle> vehiclesList = new ArrayList<>();
        while (!command.equals("End")) {
            String[] commandLineArr = command.split("\\s+");
            Vehicle currentVehicle = new Vehicle(commandLineArr[0], commandLineArr[1]
                    , commandLineArr[2], Integer.parseInt(commandLineArr[3]));
            vehiclesList.add(currentVehicle);
            command = scanner.nextLine();
        }
        String checkModel = scanner.nextLine();
        while (!checkModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getModelOfVehicle().equals(checkModel)) {
                    System.out.printf("Type: %s%n", vehicle.getTypeOfVehicle().substring(0, 1).toUpperCase() + vehicle.getTypeOfVehicle().substring(1).toLowerCase());
                    System.out.printf("Model: %s%n", vehicle.getModelOfVehicle());
                    System.out.printf("Color: %s%n", vehicle.getColorOfVehicle());
                    System.out.printf("Horsepower: %d%n", vehicle.getHorsepowerOfVehicle());
                }
            }
            checkModel = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",getAverageHorsepower(vehiclesList,"car"));
        System.out.printf("Trucks have average horsepower of: %.2f.%n",getAverageHorsepower(vehiclesList,"truck"));

    }
    public static double getAverageHorsepower(List<Vehicle> vehicleList, String typeOfVehicle) {
        double averageHorsepower = 0;
        int count = 0;
        for (Vehicle e : vehicleList) {
            if (e.getTypeOfVehicle().equals(typeOfVehicle)) {
                averageHorsepower += e.getHorsepowerOfVehicle();
                count++;
            }
        }
        if (count == 0) {
            averageHorsepower = 0;
        } else {
            averageHorsepower = averageHorsepower / count;
        }

        return averageHorsepower;
    }
}
