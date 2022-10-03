import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] targetsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        int countOfShot = 0;
        while (!command.equals("End")){
            int shot = Integer.parseInt(command);
            if (shot>=0 && shot<targetsArr.length && targetsArr[shot]!=0){
                for (int i = 0; i <targetsArr.length ; i++) {
                    if (targetsArr[i]>targetsArr[shot] && targetsArr[i]!=-1){
                        targetsArr[i]-=targetsArr[shot];
                    }else if (targetsArr[i]!=-1 && targetsArr[i]<=targetsArr[shot]){
                        targetsArr[i]+=targetsArr[shot];
                    }
                }

                targetsArr[shot] = -1;
                countOfShot++;
            }


            command = scanner.nextLine();
        }
        System.out.printf("Shot targets %d -> ",countOfShot);
        for (int i = 0; i < targetsArr.length; i++) {
            System.out.print(targetsArr[i] +" ");
        }
    }
}
