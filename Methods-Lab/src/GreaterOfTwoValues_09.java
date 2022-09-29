import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        switch (command){
            case"int":
                getMax(Integer.parseInt(first),Integer.parseInt(second));
                break;
            case "char":
            case "string":
                getMax(first,second);
                break;

        }
    }
    static void getMax(int firstNum,int secondNum) {
        if (firstNum > secondNum) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }
    static void getMax(String first,String second){
        if (first.compareTo(second)>=0){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
    }
    static void getMax(char first,char second){
        if (first>second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
    }
}
