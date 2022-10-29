import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrderByAge_06 {
    static class People{
        String name;
        String id;
        int age;

        public People(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public String getId() {
            return this.id;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",getName(),getId(),getAge());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<People> peopleList = new ArrayList<>();
        while (!command.equals("End")){
            String[] commandLineArr = command.split("\\s+");
            People currentPeople = new People(commandLineArr[0],commandLineArr[1],Integer.parseInt(commandLineArr[2]));
            peopleList.add(currentPeople);
            command =scanner.nextLine();
        }
        List<People> sortedPeopleList = peopleList.stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
        for (People people: sortedPeopleList) {
            System.out.println(people.toString());
        }
    }
}
