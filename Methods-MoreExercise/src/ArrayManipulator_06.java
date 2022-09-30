import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = "";
        while (!command.equals("end")) {
            String[] input = scanner.nextLine().split(" ");
            command = input[0];
            switch (command) {
                case "exchange":
                    numbers = doExchange(input, numbers);
                    break;
                case "max":
                    getMax(input, numbers);
                    break;
                case "min":
                    getMin(input, numbers);
                    break;
                case "first":
                    if (Integer.parseInt(input[1]) > numbers.length) {
                        System.out.println("Invalid count");
                        break;
                    } else {
                        showFirst(input, numbers);
                    }

                    break;
                case "last":
                    if (Integer.parseInt(input[1]) > numbers.length) {
                        System.out.println("Invalid count");
                        break;
                    } else {
                        showLast(input, numbers);
                    }

                    break;
            }


        }
        System.out.println(Arrays.toString(numbers));
    }

    static int[] doExchange(String[] input, int[] numbers) {
        int n = Integer.parseInt(input[1]);
        if (n > numbers.length) {
            System.out.println("Invalid index");
        } else {
            for (int i = 0; i <= n; i++) {
                int memoryNumber = numbers[0];
                for (int j = 0; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers[numbers.length - 1] = memoryNumber;
            }
        }
        return numbers;
    }

    static void getMax(String[] input, int[] numbers) {
        String command = input[1];
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;
        switch (command) {
            case "even":
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0 && numbers[i] >= maxNumber) {
                        maxNumber = numbers[i];
                        index = i;
                    }
                }
                break;
            case "odd":
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 != 0 && numbers[i] >= maxNumber) {
                        maxNumber = numbers[i];
                        index = i;
                    }
                }
                break;

        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }

    }

    static void getMin(String[] input, int[] numbers) {
        String command = input[1];
        int minNumber = Integer.MAX_VALUE;
        int index = -1;
        switch (command) {
            case "even":
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0 && numbers[i] <= minNumber) {
                        minNumber = numbers[i];
                        index = i;
                    }
                }
                break;
            case "odd":
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 != 0 && numbers[i] <= minNumber) {
                        minNumber = numbers[i];
                        index = i;
                    }
                }
                break;

        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    static void showFirst(String[] input, int[] numbers) {

        int showCount = Integer.parseInt(input[1]);
        int[] firstNumbers = new int[showCount];
        int k = 0;
        switch (input[2]) {
            case "even":
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0) {
                        firstNumbers[k] = numbers[i];
                        k++;
                        if (k == showCount) {
                            break;
                        }
                    }
                }
                break;
            case "odd":
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 != 0) {
                        firstNumbers[k] = numbers[i];
                        k++;
                        if (k == showCount) {
                            break;
                        }
                    }
                }
                break;
        }
        if (k > 0) {
            int[] firstNumbersDone = new int[k];
            for (int i = 0; i < k; i++) {
                firstNumbersDone[i] = firstNumbers[i];
            }
            System.out.println(Arrays.toString(firstNumbersDone));
        } else {
            System.out.println("[]");
        }
    }

    static void showLast(String[] input, int[] numbers) {

        int showCount = Integer.parseInt(input[1]);
        int[] firstNumbers = new int[showCount];
        int k = 0;
        switch (input[2]) {
            case "even":
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (numbers[i] % 2 == 0) {
                        firstNumbers[k] = numbers[i];
                        k++;
                        if (k == showCount) {
                            break;
                        }
                    }
                }
                break;
            case "odd":
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (numbers[i] % 2 != 0) {
                        firstNumbers[k] = numbers[i];
                        k++;
                        if (k == showCount) {
                            break;
                        }
                    }
                }
                break;

        }
        if (k > 0) {
            int[] firstNumbersDone = new int[k];
            for (int i = 0; i < k; i++) {
                firstNumbersDone[i] = firstNumbers[i];
            }
            System.out.println(Arrays.toString(firstNumbersDone));
        } else {
            System.out.println("[]");
        }
    }
}
