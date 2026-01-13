package com.prince.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class helloworld {

    @GetMapping("/")
    public String aboutMe(Model m) {
        m.addAttribute("activePage","home");

        List<project> prj = new ArrayList<>();
        prj.add(new project("onCheck",
                "onCheck",
                "onCheck",
                "/images/onCheck/onCheckFrontUi.png",
                "A Java-based Spring Boot application.",
                List.of(
                        new Tech("Java", "/images/java-logo.png"),
                        new Tech("Spring Boot", "/images/spring-boot-logo.png"),
                        new Tech("HTML", "/images/html-logo.png")
                )));
//        prj.add(new project("realState","realState","realState",));

        m.addAttribute("projects",prj);
        return "layout";
    }

    @GetMapping("/onCheck")
    public String onCheck(Model m) {
        m.addAttribute("activePage","onCheck");
        m.addAttribute("onCheckStyle",true);
        return "layout";
    }

    @GetMapping("/realState")
    public String realState(Model m) {
        m.addAttribute("activePage","realState");
        return "layout";
    }
}
