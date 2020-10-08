package garhettM.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @PostMapping("/song")
    public RedirectView addSong(String songTitle, int songLength, int trackNumber, long albumId) {
        Album bum = albumRepository.getOne(albumId);
        Song son = new Song(bum, songTitle, songLength, trackNumber);
        songRepository.save(son);
        return new RedirectView("/album?albumId=" + albumId);
    }

    @GetMapping("/songs")
    public String showSongs(Model songsMod) {
        ArrayList<Song> songs = new ArrayList<>();
        songsMod.addAttribute("songs", songs);
        return "songs";
    }
}
