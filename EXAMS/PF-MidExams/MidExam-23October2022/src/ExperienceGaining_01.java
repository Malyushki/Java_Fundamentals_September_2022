import java.util.Scanner;

public class ExperienceGaining_01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double expNeeded = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 1; i <=battles ; i++) {
            double expGain = Double.parseDouble(scanner.nextLine());
            if (i%15==0){
                expGain=expGain*1.05;
            }
            if (i%5==0){
                expGain=expGain*0.9;
            }
            if (i%3==0){
                expGain=expGain*1.15;
            }
            count++;
            expNeeded-=expGain;
            if (expNeeded<=0){
                break;
            }
            }

        if (expNeeded<=0){
            System.out.printf("Player successfully collected his needed experience for %d battles.",count);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",expNeeded);
        }
    }
}
