import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String text = scanner.nextLine();


        while (!text.equals("end")){
            StringBuilder revText = new StringBuilder(text).reverse();
            System.out.printf("%s = %s%n",text,revText);

            text = scanner.nextLine();

        }




    }
}
