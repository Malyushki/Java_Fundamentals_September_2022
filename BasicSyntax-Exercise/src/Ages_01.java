import java.util.Scanner;

public class Ages_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stageOfLife = {"baby","child","teenager","adult","elder"};
        int age = Integer.parseInt(scanner.nextLine());
        if (age>=0 && age<=2){
            System.out.println(stageOfLife[0]);
        } else if (age>=3 && age<=13) {
            System.out.println(stageOfLife[1]);
        }else if (age>=14 && age<=19) {
            System.out.println(stageOfLife[2]);
        }else if (age>=20 && age<=65) {
            System.out.println(stageOfLife[3]);
        }else if (age>=66) {
            System.out.println(stageOfLife[4]);
        }

    }
}
