import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> courseSchedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandType = command.split(":");
            switch (commandType[0]) {
                case "Add":
                    if (!courseSchedule.contains(commandType[1])) {
                        courseSchedule.add(commandType[1]);
                    }
                    break;
                case "Insert":
                    if (!courseSchedule.contains(commandType[1])) {
                        courseSchedule.add(Integer.parseInt(commandType[2]), commandType[1]);
                    }
                    break;
                case "Remove":
                    if (courseSchedule.contains(commandType[1])) {
                        courseSchedule.remove(commandType[1]);

                    }
                    if (courseSchedule.contains(commandType[1] + "-Exercise")) {
                        courseSchedule.remove((commandType[1] + "-Exercise"));
                    }
                    break;
                case "Swap":
                    if (courseSchedule.contains(commandType[1]) && courseSchedule.contains(commandType[2])) {
                        int indexA = courseSchedule.indexOf(commandType[1]);
                        int indexB = courseSchedule.indexOf(commandType[2]);
                        String saveElement = courseSchedule.get(indexA);
                        courseSchedule.set(indexA, courseSchedule.get(indexB));
                        courseSchedule.set(indexB, saveElement);
                        if (courseSchedule.contains(commandType[1] + "-Exercise")) {
                            int indexExA = courseSchedule.indexOf(commandType[1]) + 1;
                            courseSchedule.remove((commandType[1] + "-Exercise"));
                            courseSchedule.add(indexExA, commandType[1] + "-Exercise");
                        }
                        if (courseSchedule.contains(commandType[2] + "-Exercise")) {
                            int indexExA = courseSchedule.indexOf(commandType[2]) + 1;
                            courseSchedule.remove((commandType[2] + "-Exercise"));
                            courseSchedule.add(indexExA, commandType[2] + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":

                    if (courseSchedule.contains(commandType[1])) {
                        if (!courseSchedule.contains(commandType[1] + "-Exercise")) {
                            int index = courseSchedule.indexOf(commandType[1]);
                            courseSchedule.add(index + 1, commandType[1] + "-Exercise");
                        }
                    } else {
                        courseSchedule.add(commandType[1]);
                        courseSchedule.add(commandType[1] + "-Exercise");
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < courseSchedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, courseSchedule.get(i));
        }
    }

}
