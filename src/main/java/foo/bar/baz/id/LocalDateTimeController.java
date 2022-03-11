package foo.bar.baz.id;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class LocalDateTimeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    @ResponseBody
    public String index(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date.replace("T", " "), formatter);
        return dateTime.toString();
    }
}
