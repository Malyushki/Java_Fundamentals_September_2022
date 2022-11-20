    import java.util.Arrays;
    import java.util.Scanner;

    public class WorldTour_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String travelList = scanner.nextLine();
            String command = scanner.nextLine();

            while (!command.equals("Travel")) {
                String[] commandType = command.split(":");
                switch (commandType[0]) {
                    case "Add Stop":
                        int indexForAdd = Integer.parseInt( commandType[1]);
                        String addText = commandType[2];
                       StringBuilder builder = new StringBuilder(travelList);
                       builder.insert(indexForAdd,addText);
                       travelList = builder.toString();
                       System.out.println(travelList);
                        break;
                    case "Remove Stop":
                        int startIndex = Integer.parseInt(commandType[1]);
                        int endIndex = Integer.parseInt(commandType[2]);

                        if (startIndex >= 0 && startIndex < travelList.length() && endIndex >= 0
                                && endIndex < travelList.length()) {
                        builder = new StringBuilder(travelList);
                        builder.replace(startIndex,endIndex+1,"");
                        travelList = builder.toString();
                        }
                        System.out.println(travelList);
                        break;
                    case "Switch":
                        String oldString = commandType[1];
                        String newString = commandType[2];
                        if (travelList.contains(oldString)) {
                            travelList = travelList.replaceAll(oldString, newString);
                        }
                        System.out.println(travelList);
                        break;
                }

                command = scanner.nextLine();
            }
            System.out.println("Ready for world tour! Planned stops: " + travelList.toString());
        }
    }
