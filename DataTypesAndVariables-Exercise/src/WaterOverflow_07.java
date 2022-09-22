    import java.util.Scanner;

    public class WaterOverflow_07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int waterTank = 255;
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <=n ; i++) {
                int pouring = Integer.parseInt(scanner.nextLine());
                if (pouring>waterTank){
                    System.out.println("Insufficient capacity!");
                }else {
                    waterTank-=pouring;
                }
            }

            System.out.println(255-waterTank);
        }
    }
