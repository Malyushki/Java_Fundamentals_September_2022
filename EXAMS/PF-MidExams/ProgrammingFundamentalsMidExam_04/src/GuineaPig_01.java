import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodQuantity = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayQuantity = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverQuantity = Double.parseDouble(scanner.nextLine()) * 1000;
        double weight = Double.parseDouble(scanner.nextLine()) * 1000;
        boolean runOut = false;

        for (int i = 1; i <= 30; i++) {
            foodQuantity -= 300;
            if (foodQuantity <= 0) {
                runOut = true;
                break;
            }
            if (i % 2 == 0) {
                hayQuantity -= 0.05 * foodQuantity;
            }
            if (hayQuantity <= 0) {
                runOut = true;
                break;
            }
            if (i % 3 == 0) {
                coverQuantity -= weight / 3;
            }
            if (coverQuantity <= 0) {
                runOut = true;
                break;
            }
        }
        if (runOut){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodQuantity/1000,hayQuantity/1000,coverQuantity/1000);
        }
    }
}
