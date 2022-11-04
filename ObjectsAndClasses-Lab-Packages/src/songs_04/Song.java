package songs_04;

public class Song {
    String typeList;
    String name;
    String time;

    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }


    public void toFilter(String filter) {
        if (this.typeList.equals(filter)) {
            System.out.println(this.getName());
        }
    }

}
