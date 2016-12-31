package com.github.zzycjcg.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 12/28/16.
 */
@Controller
@EnableAutoConfiguration
@ImportResource("spring-project.xml")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CharacterEncodingFilter makeUTF8CharacterFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8");
        filter.setForceEncoding(true);
        return filter;
    }

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

}
