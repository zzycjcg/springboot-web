package com.github.zzycjcg.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 12/29/16.
 */
@Controller
@RequestMapping("/main")
public class MainCtrl {

    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("main/index");
    }
}
