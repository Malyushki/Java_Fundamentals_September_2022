import java.util.Scanner;
public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        int explosion = 0;
        for (int i = 0; i <text.length() ; i++) {
            if (text.charAt(i)=='>'){
                if (Character.isDigit(text.charAt(i+1))){
                explosion = Integer.parseInt(String.valueOf(text.charAt(i+1))) + explosion;
           while (explosion>0) {
               if (text.charAt(i + 1) != '>') {
                   text.delete(i + 1, i + 2);
                   explosion--;
               } else {
                   break;
               }
           }
           }
            }
        }
        System.out.println(text);
    }
}
