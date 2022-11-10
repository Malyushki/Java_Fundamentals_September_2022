import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {
    static class Vehicles{
        String typeOfVehicle;
        String model;
        String color;
        double horsepower;

        public Vehicles(String typeOfVehicle, String model, String color, double horsepower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public double getHorsepower() {
            return horsepower;
        }

        private static double averageCarHorsepower(List<Vehicles> vehiclesList){
            double averageCarHorsepower = 0.0;
            int count = 0;
            for (Vehicles type:vehiclesList) {
                if (type.typeOfVehicle.equals("car")){
                    averageCarHorsepower+=type.horsepower;
                    count++;
                }
            }
            averageCarHorsepower = averageCarHorsepower/count;
            return averageCarHorsepower;
        }
        private static double averageTruckHorsepower(List<Vehicles> vehiclesList ){
            double averageTruckHorsepower = 0.0;
            int count = 0;
            for (Vehicles type:vehiclesList) {
                if (type.typeOfVehicle.equals("truck")){
                    averageTruckHorsepower+=type.horsepower;
                    count++;
                }
            }
            averageTruckHorsepower = averageTruckHorsepower/count;
            return averageTruckHorsepower;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String command =scanner.nextLine();
        List<Vehicles> vehiclesList = new ArrayList<>();
while (!command.equals("End")){
    String [] commandArr = command.split("\\s+");
    Vehicles currentV = new Vehicles(commandArr[0],commandArr[1],commandArr[2],Double.parseDouble(commandArr[3]));
    vehiclesList.add(currentV);
    command=scanner.nextLine();

}
command = scanner.nextLine();
while (!command.equals("Close the Catalogue")){


    command=scanner.nextLine();
}
        double averageTruckHorsepower = Vehicles.averageTruckHorsepower(vehiclesList);
        double averageCarHorsepower = Vehicles.averageCarHorsepower(vehiclesList);
        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCarHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.",averageTruckHorsepower);
    }

}
