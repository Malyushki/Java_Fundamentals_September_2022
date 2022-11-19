import java.util.Arrays;
import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Travel")){
           String[] commandType = command.split(":");
            switch (commandType[0]){
                case "Add Stop" :
                    int indexAddStop = Integer.parseInt(commandType[1]);
                    String stopAdd = commandType[2];
                    if (indexAddStop>=0 && indexAddStop<stops.length()){
                        stops.insert(indexAddStop,stopAdd);
                        System.out.println(stops.toString());
                    }

                    break;
                case "Remove Stop" :
                    int startIndex= Integer.parseInt(commandType[1]);
                    int endIndex= Integer.parseInt(commandType[2]);
                    if (stops.length()>0) {
                        if (startIndex >= 0 && endIndex <= stops.length()) {
                            endIndex++;
                            stops.replace(startIndex, endIndex, "");
                            System.out.println(stops.toString());
                        }
                    }
                    break;
                case "Switch" :
                    String oldString = commandType[1];
                    String newString = commandType[2];
                  // while (stops.toString().contains(oldString)){
                       stops = new StringBuilder(stops.toString().replaceAll(oldString,newString));
                       System.out.println(stops.toString());
              //  }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops.toString());
    }
}
