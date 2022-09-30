import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
getClosesPoint(x1,y1,x2, y2);
    }
    static void getClosesPoint (int x1 , int y1,int x2 , int y2) {
        double p1 = Math.pow(Math.pow(x1, 2) + Math.pow(y1, 2), 0.5);
        double p2 = Math.pow(Math.pow(x2, 2) + Math.pow(y2, 2), 0.5);
        if (p1 <= p2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}
