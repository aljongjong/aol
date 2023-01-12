package aljongjong.aol.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping
    public ModelAndView getDashboard() {
        ModelAndView mav = new ModelAndView("dashboard");
        return mav;
    }
    @GetMapping(value = "/board/{page}")
    public ModelAndView getBoard(@PathVariable("page") Long page) {
        log.info("page={}", page);
        ModelAndView mav = new ModelAndView("response/board")
                .addObject("data", page);
        return mav;
    }

}
