package aljongjong.aol.controller;


import aljongjong.aol.dto.BoardDto;
import aljongjong.aol.service.BasicService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class BasicController {

    //Lombok 사용, @Slf4j로 대체
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private BasicService basicService;

    @GetMapping
    public ModelAndView getDashboard() {
        ModelAndView mav = new ModelAndView("dashboard");
        return mav;
    }
    @GetMapping(value = "/board/{page}")
    public ModelAndView getBoard(@PathVariable("page") Long page) {
        log.info("page={}", page);
        List<BoardDto> list = basicService.getBoardList();

        ModelAndView mav = new ModelAndView("response/board")
                .addObject("data", page)
                .addObject("boardList", list);
        return mav;
    }


}
