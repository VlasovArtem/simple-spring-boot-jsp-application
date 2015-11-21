package com.vlasovartem.tvspace.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

/**
 * Created by artemvlasov on 20/11/15.
 */

@Controller
public class TestController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView printWelcome() {
        String now = LocalDate.now().toString();
        return new ModelAndView("index", "now", now);
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test(ModelMap map) {
        map.put("message", "Hello from Controller");
        return "index";
    }
}
