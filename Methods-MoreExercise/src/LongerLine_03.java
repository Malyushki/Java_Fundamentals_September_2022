import java.util.Scanner;

public class LongerLine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

biggerLine(x1,y1,x2,y2,x3,y3,x4,y4);


    }
    static void biggerLine (int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        double length1 = Math.pow((Math.pow((y2-y1),2))+(Math.pow((x2-x1),2)),0.5);
        double length2 = Math.pow((Math.pow((y4-y3),2))+(Math.pow((x4-x3),2)),0.5);

      /*  if (Math.abs((x1+y1))>=Math.abs((x2+y2))) {
            length1 = Math.abs((x1 + y1)) - Math.abs((x2 + y2));
        }else {
            length1 = Math.abs((x2 + y2)) - Math.abs((x1 + y1)) ;
        }
        if (Math.abs((x3+y3))>=Math.abs((x4+y4))){
            length2 = Math.abs((x3+y3)) - Math.abs((x4+y4));
        }else {
            length2 = Math.abs((x4+y4)) -Math.abs((x3+y3));
        }

       */
       if (Math.abs(length1)>=Math.abs(length2)){
           getClosesPoint(x1,y1,x2,y2);
       }else {
           getClosesPoint(x3,y3,x4,y4);
       }


    }
    static void getClosesPoint (int x1 , int y1,int x2 , int y2){
        double p1 = Math.pow(Math.pow(x1,2)+Math.pow(y1,2),0.5) ;
        double p2 = Math.pow(Math.pow(x2,2)+Math.pow(y2,2),0.5) ;
        if (p1<=p2){
            System.out.printf("(%d, %d)",x1,y1);
            System.out.printf("(%d, %d)",x2,y2);
        }else {
            System.out.printf("(%d, %d)",x2,y2);
            System.out.printf("(%d, %d)",x1,y1);
        }
    }
}
