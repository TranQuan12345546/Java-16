package tiktok;

public class Song {
    public static int SONG_ID = 100;

    private final int id;
    private String name;
    private String singer;

    public Song() {
        this.id = SONG_ID;
        SONG_ID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
