package garhettM.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller

public class AlbumController {
    @GetMapping("/albums")

    public String showAlbum(
            Model albumMod
    ) {
        ArrayList<Album> newAlbum = new ArrayList<>();
        newAlbum.add(new Album("Views", "Drake", 15, 840, "https://image-cdn.hypb.st/https%3A%2F%2Fhypebeast.com%2Fimage%2F2016%2F04%2Fdrake-views-digital-booklet-0.jpg?w=960&cbr=1&q=90&fit=max"));
        newAlbum.add(new Album("Six Pc HotEp", "6Lack", 12, 10084, "https://media.pitchfork.com/photos/5efc9d87464fe661509aaeae/1:1/w_600/6pc%20Hot%20EP_6LACK.jpg"));
        newAlbum.add(new Album("Malibu", "Anderson.PaaK", 29, 2837, "https://cdn.shopify.com/s/files/1/0809/6147/products/AP_Malibu_Cover_Flat_APPROVED_Web_28NOV15.jpg?v=1450905558"));
        albumMod.addAttribute("albumMod", newAlbum);
        return "Albums";
    }
}