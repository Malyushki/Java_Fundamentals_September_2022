import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nPokePower = Integer.parseInt(scanner.nextLine());
        int mDistance = Integer.parseInt(scanner.nextLine());
        int yExhaustionFactor = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int startingPower = nPokePower;

        while (nPokePower >= mDistance) {
            if (nPokePower == startingPower / 2 && yExhaustionFactor != 0) {
                nPokePower = nPokePower / yExhaustionFactor;
                if (nPokePower < mDistance) {
                    break;
                }
            }


            count++;
            nPokePower -= mDistance;
        }

        System.out.println(nPokePower);
        System.out.println(count);
    }
}
