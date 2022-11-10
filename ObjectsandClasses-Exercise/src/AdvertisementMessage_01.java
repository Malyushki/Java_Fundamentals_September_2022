import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    static class AdvertisementMessages {
        String[] laudatoryPhrase = {"Excellent product.", "Such a great product.", "I always use that product."
                , "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rnd = new Random();

        public String getLaudatoryPhrase() {
            return laudatoryPhrase[rnd.nextInt(laudatoryPhrase.length)];
        }

        public String getEvent() {
            return event[rnd.nextInt(event.length)];
        }

        public String getAuthor() {
            return author[rnd.nextInt(author.length)];
        }

        public String getCity() {
            return city[rnd.nextInt(city.length)];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            AdvertisementMessages newMassage = new AdvertisementMessages();
            System.out.printf("%s %s %s - %s%n",newMassage.getLaudatoryPhrase(),newMassage.getEvent(),newMassage.getAuthor(),
                    newMassage.getCity());
        }

    }
}

