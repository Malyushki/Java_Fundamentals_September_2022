package songs_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] songData = scanner.nextLine().split("_");
            Song newSong = new Song(songData[0], songData[1], songData[2]);
            songList.add(newSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song song:songList) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song:songList) {
                song.toFilter(command);
            }
        }
    }
}
