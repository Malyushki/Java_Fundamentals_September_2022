import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double change = 0;

        while (!input.equals("Start")) {
            switch (input) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    change += Double.parseDouble(input);
                    break;
                default:
                    System.out.printf("Cannot accept %.2f%n", Double.parseDouble(input));
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")){
         switch (input){
             case "Nuts":
                    if (change>=2){
                        System.out.println("Purchased Nuts");
                        change-=2;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                 break;
             case "Water":
                 if (change>=0.7){
                     System.out.println("Purchased Water");
                     change-=0.7;
                 }else {
                     System.out.println("Sorry, not enough money");
                 }
                 break;
             case "Crisps":
                 if (change>=1.5){
                     System.out.println("Purchased Crisps");
                     change-=1.5;
                 }else {
                     System.out.println("Sorry, not enough money");
                 }
                 break;
             case "Soda":
                 if (change>=0.8){
                     System.out.println("Purchased Soda");
                     change-=0.8;
                 }else {
                     System.out.println("Sorry, not enough money");
                 }
                 break;
             case "Coke":
                 if (change>=1){
                     System.out.println("Purchased Coke");
                     change-=1;
                 }else {
                     System.out.println("Sorry, not enough money");
                 }
                 break;
             default:
                 System.out.println("Invalid product");

         }
         input=scanner.nextLine();
        }

        System.out.printf("Change: %.2f",change);
    }

}
