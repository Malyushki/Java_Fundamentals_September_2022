public class sas {
    public static void main(String[] args) {
        for (int i = 10; i >3 ; i-=2) {
            System.out.printf("%d",i);
        }
        System.out.println();
        printTech("Java");
        int a = 10;
        double b = 5.5;
        a+=b;





        System.out.println(a);
    }
    public void printTech(String text){
        System.out.println("I love" + text);
    }

}
