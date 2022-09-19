import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String typeDay = scanner.nextLine();
double totalPrice = 0;
        switch (typePeople){
            case "Students":
                switch (typeDay){
                    case "Friday":
                        totalPrice = countPeople * 8.45;
                        break;
                    case "Saturday":
                        totalPrice = countPeople * 9.80;
                        break;
                    case "Sunday":
                        totalPrice = countPeople * 10.46;
                        break;
                }
                if (countPeople>=30){
                    totalPrice = totalPrice*0.85;
                }
                break;
            case "Business":
                if (countPeople>=100){
                   countPeople-=10;
                }

                switch (typeDay){
                    case "Friday":
                        totalPrice = countPeople * 10.90;
                        break;
                    case "Saturday":
                        totalPrice = countPeople * 15.60;
                        break;
                    case "Sunday":
                        totalPrice = countPeople * 16;
                        break;
                }
                break;
            case "Regular":
                switch (typeDay){
                    case "Friday":
                        totalPrice = countPeople * 15;
                        break;
                    case "Saturday":
                        totalPrice = countPeople * 20;
                        break;
                    case "Sunday":
                        totalPrice = countPeople * 22.50;
                        break;
                }
                if (countPeople>=10 && countPeople<=20 ){
                    totalPrice = totalPrice*0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
