import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        String[] treasureChest = scanner.nextLine().split("\\|");
        while (!command.equals("Yohoho!")){

            String[] input = scanner.nextLine().split(" ");
            command = input[0];
            switch (command){
                case "Loot":
                    boolean isContained = true;
                    int n =0;
                    String [] addItems = new String[input.length];
                    for (int i = 1; i <input.length ; i++) {
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (!input[i].equals(treasureChest[j])){
                                isContained = false;
                            }else {
                                isContained = true;
                                break;
                            }

                            }
                        if (!isContained){
                            addItems[n] = input[i];
                            n++;
                            isContained=true;
                        }

                    }
                    for (int i = 0; i <addItems.length; i++) {
                        System.out.print(addItems[i] + ", ");
                    }
                    break;
            }
        }
    }
}
