import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> listSong = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String songInput = scanner.nextLine();
            String[] songInputArr = songInput.split("_");
            Song currentSong = new Song(songInputArr[0], songInputArr[1], songInputArr[2]);
            listSong.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song e : listSong) {
                System.out.println(e.getName());
            }
        } else {
            for (Song e : listSong) {
                if (e.getTypeList().equals(command)) {
                    System.out.println(e.getName());
                }

            }
        }

    }
}