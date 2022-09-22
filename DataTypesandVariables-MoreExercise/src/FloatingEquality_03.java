import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = new BigDecimal(Double.parseDouble(scanner.nextLine()));
        BigDecimal b = new BigDecimal(Double.parseDouble(scanner.nextLine()));
        BigDecimal c = BigDecimal.valueOf(0.000001);
      boolean isSmallerDif =  (a.subtract(b)).abs().compareTo(c)<0.000001;
        if (isSmallerDif){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }
}
