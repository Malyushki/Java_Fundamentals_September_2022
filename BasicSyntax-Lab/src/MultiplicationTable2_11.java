import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startFrom = Integer.parseInt(scanner.nextLine());
        if (startFrom>10){
            System.out.printf("%d X %d = %d",number,startFrom,number*startFrom);
        }else {
            for (int i = startFrom; i <=10 ; i++) {
                System.out.printf("%d X %d = %d%n",number,i,number*i);
            }
        }
    }
}
