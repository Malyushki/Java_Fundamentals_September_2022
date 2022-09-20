import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.charAt(0)>=97 && input.charAt(0)<=122 ){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
