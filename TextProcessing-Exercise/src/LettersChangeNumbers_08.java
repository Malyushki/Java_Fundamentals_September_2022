import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        double currentNumberValue = 0;
        double sum = 0;
        for (String combo:inputArr) {
            sum +=getSpecialNumber(combo);
            
        }
        System.out.printf("%.2f",sum);
    }
    private static double getSpecialNumber ( String str){
     StringBuilder stringBuilder = new StringBuilder(str);
     stringBuilder.deleteCharAt(0);
     stringBuilder.deleteCharAt(stringBuilder.length()-1);
     double number = Double.parseDouble(stringBuilder.toString());

    if (Character.isLowerCase(str.charAt(0))){
        int firstNumber = str.charAt(0) - 96;
        number = number*firstNumber;
    }else {
        int firstNumber = str.charAt(0) - 64;
        number = number/firstNumber;
    }
if (Character.isLowerCase(str.charAt(str.length()-1))){
    int lastNumber = str.charAt(str.length()-1) - 96;
    number+=lastNumber;
}else {
    int lastNumber = str.charAt(str.length()-1) - 64;
    number-=lastNumber;
}

return number;
    }
}
