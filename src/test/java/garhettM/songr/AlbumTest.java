package garhettM.songr;

import org.junit.Test;
import static org.junit.Assert.*;



public class AlbumTest {


    @Test public void titleTest() {
        Album testMe = new Album("FakeTitle", "FakeArtist", 15, 124, "http:www.fakeimg.com/jpg");

        testMe.setSongCount(5);
        assertEquals(5, testMe.getSongCount());
    }

}
