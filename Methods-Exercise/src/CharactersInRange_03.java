import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextLine().charAt(0);
        int end = scanner.nextLine().charAt(0);
        getChars(start, end);
    }

    static void getChars(int start, int end) {
        if (start>end){
            start +=end;
            end = start - end;
            start = start - end;
        }
        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }

    }
}
