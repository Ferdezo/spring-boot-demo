package pl.coderslab.springbootdemo.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final Logger log = LogManager.getLogger(HomeController.class);

    @GetMapping("/")
    public String hello() {
        log.debug("Entering controller");
        return "index";
    }
}
