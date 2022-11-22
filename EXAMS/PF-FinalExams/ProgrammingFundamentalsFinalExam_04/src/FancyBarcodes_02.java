import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[@][#]+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])[@][#]+";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String barcode = matcher.group("barcode");
                StringBuilder addBCGroup = new StringBuilder();
                for (int j = 0; j <barcode.length() ; j++) {
                    char symbol = barcode.charAt(j);
                    if (Character.isDigit(symbol)){
                        addBCGroup.append(symbol);
                    }
                }
                if (addBCGroup.toString().equals("")){
                    addBCGroup.append("00");
                }
                System.out.println("Product group: "+addBCGroup.toString());

            }else {
                System.out.println("Invalid barcode");
            }

        }

    }
}
