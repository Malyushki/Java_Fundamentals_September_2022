import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int bestSnowballSnow = Integer.MIN_VALUE;
        int bestSnowballTime = Integer.MIN_VALUE;
        int bestSnowballQuality = Integer.MIN_VALUE;
        double bestSnowballValue = -Double.MAX_VALUE;

        for (int i = 1; i <=n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((snowballSnow*1.00/snowballTime),snowballQuality);
            if (snowballValue>bestSnowballValue){
                bestSnowballValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",bestSnowballSnow,bestSnowballTime,bestSnowballValue,bestSnowballQuality);
    }
}
