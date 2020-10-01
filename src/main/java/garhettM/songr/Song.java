package garhettM.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    public Album album;

    public String songTitle;
    public int songLength;
    public int trackNumber;

    public Song(){};

    public Song(Album album, String songTitle, int songLength, int trackNumber) {
        this.album = album;
        this.songTitle = songTitle;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
    }

}
