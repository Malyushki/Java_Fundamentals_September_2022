import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> raceTrack = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int distance = (raceTrack.size()-1)/2;
        double left = 0;
        double right = 0;
        for (int i = 0; i <distance ; i++) {
            if (raceTrack.get(i) == 0){
                left = left*0.8;
            }else {
                left +=raceTrack.get(i);
            }
            if (raceTrack.get(raceTrack.size()-1-i)==0){
                right = right*0.8;

            }else {
                right +=raceTrack.get(raceTrack.size()-1-i);
            }
        }
        if (right<left){
            System.out.printf("The winner is right with total time: %.1f",right);
        }else {
            System.out.printf("The winner is left with total time: %.1f",left);
        }
    }
}
