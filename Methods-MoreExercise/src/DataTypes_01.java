import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input){
            case "int":
                System.out.println(getType(Integer.parseInt(scanner.nextLine())));
                break;
            case "real":
                System.out.printf("%.2f",getType(Double.parseDouble(scanner.nextLine())));
                break;
            case "string":
                System.out.println(getType(scanner.nextLine()));
                break;

        }
    }

    static int getType(int number){
        return number*2;
    }
     static double getType(double number){
        return number*1.5;
    }
    static String getType(String text){

        return "$" + text + "$";
    }

}
