import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int position = 0;
       int [] neighborhood = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
       String command = scanner.nextLine();
       while (!command.equals("Love!")){
       String[] commandParts = command.split(" ");
       int jump = Integer.parseInt(commandParts[1]);
        position+=jump;
        if (position>neighborhood.length-1){
            position = 0;
        }
        if (neighborhood[position]==0){
            System.out.printf("Place %d already had Valentine's day.%n",position);

        }else {
            neighborhood[position] -=2;
            if (neighborhood[position]<=0){
                System.out.printf("Place %d has Valentine's day.%n",position);
            }
        }
        command = scanner.nextLine();
       }
       int count = 0;
        for (int i = 0; i <neighborhood.length ; i++) {
            if (neighborhood[i]>0){
                count++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n",position);
        if (count>0){
            System.out.printf("Cupid has failed %d places.",count);
        }else {
            System.out.println("Mission was successful.");
        }
    }
}
