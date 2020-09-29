package garhettM.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
    @GetMapping("/")

    public String showHome() {
        return "Home";
    }

    @GetMapping("/hello")

    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/capitalize/{to}")

    public String showCapitalize(
            Model word,
            String wordUp,
            @PathVariable String to
    ) {
        wordUp = to.toUpperCase();
        System.out.println(wordUp);
        word.addAttribute("wordUp", wordUp);
        return "Capitalize";
    }
}
