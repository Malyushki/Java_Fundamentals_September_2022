import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {
    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " - "+ age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Person currentPerson = new Person(input[0],Integer.parseInt(input[1]));
            personsList.add(currentPerson);
        }
        for (Person person:personsList) {
            if (person.getAge()>30){
                System.out.println(person.toString());
            }
        }
    }
}
