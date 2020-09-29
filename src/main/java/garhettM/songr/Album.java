package garhettM.songr;

public class Album {

    String title;
    String artist;
    int songCount;
    int length;
    String imgUrl;

    public Album(String title, String artist, int songCount, int length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return this.title;
    }

    public String getArtist() {
        return artist;
    }

    public String setArtist(String artist) {
        this.artist = artist;
        return this.artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int setSongCount(int songCount) {
        this.songCount = songCount;
        return this.songCount;
    }

    public int getLength() {
        return length;
    }

    public int setLength(int length) {
        this.length = length;
        return this.length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this.imgUrl;
    }

}
