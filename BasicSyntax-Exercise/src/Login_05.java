import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = "";
        String input = scanner.nextLine();
        int countTres = 0;
        boolean isBlocked = false;
        for (int i = 0; i < userName.length(); i++) {
            char symbol =   userName.charAt(userName.length()-1-i);
            password+=symbol;
        }
        while (!input.equals(password)){

            countTres++;
            if (countTres==4){
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (isBlocked) {
            System.out.printf("User %s blocked!",userName);
        }else {
            System.out.printf("User %s logged in.", userName);
        }
    }
}
