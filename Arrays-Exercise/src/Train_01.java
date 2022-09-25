import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int [] peoples = new int[countOfWagons];
        int sum = 0;
        for (int i = 0; i <countOfWagons ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            peoples[i] = people;
            sum +=people;
        }
        for (int i = 0; i < peoples.length ; i++) {
            System.out.print(peoples[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
