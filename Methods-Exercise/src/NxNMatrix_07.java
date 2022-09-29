import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            System.out.print(rowPrint(n));
            System.out.println();
        }
        }


        static String rowPrint (int n){
            String row = "";
       for (int i = 1; i <= n; i++) {
            row +=(n+" ");
       }
       return row;
   }
    }

