import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String[] pathArr = scanner.nextLine().split("\\\\");
        String fileName = pathArr[pathArr.length-1].split("\\.")[0];
        String fileExtension = pathArr[pathArr.length-1].split("\\.")[1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s",fileExtension);
    }
}
