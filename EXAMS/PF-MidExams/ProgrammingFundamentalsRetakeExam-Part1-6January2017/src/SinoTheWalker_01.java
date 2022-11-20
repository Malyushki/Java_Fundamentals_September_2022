import java.sql.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SinoTheWalker_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long [] timeSimoLeaves = Arrays
                .stream(scanner.nextLine().split(":"))
                .mapToLong(Long::parseLong)
                .toArray();
        int numberOfSteps = Integer.parseInt(scanner.nextLine());
        long secondsPerStep = Integer.parseInt(scanner.nextLine());
        long walkSeconds = secondsPerStep * numberOfSteps;
        timeSimoLeaves[2] = timeSimoLeaves[2]+walkSeconds;
            if (timeSimoLeaves[2]>59){
                timeSimoLeaves[1] +=timeSimoLeaves[2]/60;
                timeSimoLeaves[2] = timeSimoLeaves[2]%60;


        }
            if (timeSimoLeaves[1]>59){
                timeSimoLeaves[0] +=timeSimoLeaves[1]/60;
                timeSimoLeaves[1] =timeSimoLeaves[1]%60;
            }
        if (timeSimoLeaves[0]>23){
            timeSimoLeaves[0] = timeSimoLeaves[0]%24;

        }
        dateFormat(timeSimoLeaves,":");
    }
    public static void dateFormat (long[] time , String delimiter){
        DecimalFormat dateFormat = new DecimalFormat("00");
        String output = "";
        System.out.print("Time Arrival: ");
        for (int i = 0; i <time.length ; i++) {
            output=dateFormat.format(time[i]);
            System.out.print(output);
            if (i< time.length-1){
                System.out.print(delimiter);
            }
        }

    }
}
