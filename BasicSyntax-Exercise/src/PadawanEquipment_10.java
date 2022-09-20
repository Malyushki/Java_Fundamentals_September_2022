import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers  = Double.parseDouble(scanner.nextLine());
        double priceOfRobes  = Double.parseDouble(scanner.nextLine());
        double priceOfBelts   = Double.parseDouble(scanner.nextLine());
        double countOfLightsabers = Math.ceil(students*1.10);
        double countOfBelts = students  - Math.floor(students*1.00/6);
        double totalExpenses = (countOfBelts*priceOfBelts)+(countOfLightsabers*priceOfLightsabers)
                + (priceOfRobes*students);
        if (totalExpenses>amountOfMoney){
            System.out.printf("George Lucas will need %.2flv more.",totalExpenses-amountOfMoney);
        }else {
            System.out.printf("The money is enough - it would cost %.2flv.",totalExpenses);
        }

    }
}
