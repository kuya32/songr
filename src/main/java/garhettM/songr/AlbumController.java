package garhettM.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired
    public AlbumRepository albumRepository;

    @Autowired
    public SongRepository songRepository;

    @PostMapping("/albums/delete/{id}")
    public RedirectView removeAlbum(@PathVariable long id) {
        albumRepository.deleteById(id);
        return new RedirectView("/albums");
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist, int songCount, int length, String imgUrl) {
        Album newAlbum = new Album(
                title,
                artist,
                songCount,
                length,
                imgUrl
        );

        Song newSong = new Song(newAlbum, "", 0, 0);
        newAlbum.songs.add(newSong);

        albumRepository.save(newAlbum);
        songRepository.save(newSong);

        return new RedirectView("/albums");
    }

    @GetMapping("/albums")
    public String showAlbum(Model albumMod) {
        ArrayList<Album> albums = (ArrayList<Album>) albumRepository.findAll();
//        newAlbum.add(new Album("Views", "Drake", 15, 840, "https://image-cdn.hypb.st/https%3A%2F%2Fhypebeast.com%2Fimage%2F2016%2F04%2Fdrake-views-digital-booklet-0.jpg?w=960&cbr=1&q=90&fit=max"));
//        newAlbum.add(new Album("Six Pc HotEp", "6Lack", 12, 10084, "https://media.pitchfork.com/photos/5efc9d87464fe661509aaeae/1:1/w_600/6pc%20Hot%20EP_6LACK.jpg"));
//        newAlbum.add(new Album("Malibu", "Anderson.PaaK", 29, 2837, "https://cdn.shopify.com/s/files/1/0809/6147/products/AP_Malibu_Cover_Flat_APPROVED_Web_28NOV15.jpg?v=1450905558"));
        albumMod.addAttribute("Albums", albums);
        return "Albums";
    }
}