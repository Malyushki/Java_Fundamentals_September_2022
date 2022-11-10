import java.util.Scanner;

public class Articles_02 {
    static class Article{
        String title;
        String content;
        String author ;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return title+" - "+content+": "+author;
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0],input[1],input[2]);
        int n =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
          String[] command = scanner.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    article.setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(command[1]);
                    break;
                case "Rename":
                    article.setTitle(command[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
