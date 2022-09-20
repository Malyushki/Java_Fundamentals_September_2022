import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSpecial = false;
        int num = 0;
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n; i++) {
           num = i;
            while (num!=0){
             sum+=num%10;
             num=num/10;
           }
            switch (sum){
                case 5:
                case 7:
                case 11:
                    isSpecial=true;
                    break;
                default:
                    isSpecial=false;
            }
if (isSpecial){
    System.out.printf("%d -> True%n",i);
}else {
    System.out.printf("%d -> False%n",i);
}
       sum = 0;
        }
    }
}
