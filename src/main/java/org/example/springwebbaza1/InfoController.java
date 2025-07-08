package org.example.springwebbaza1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {

    @GetMapping("/httpInfo")
    public String httpInfo(@Autowired Model model) {

        model.addAttribute("httpInfo", "SPRING Web Baza1");;
        model.addAttribute("javaMush", "SPRING  Baza2");;
        return "infoHttp";
    }

    @GetMapping("/tcp")
    public String tcp(@Autowired Model model) {

        model.addAttribute("infoTcp", "Что такое TCP");;
        return "infoTcp";
    }

    @GetMapping("/web-socket")
    public String websocket(@Autowired Model model) {

        model.addAttribute("webSocket", "Что такое WebSocket");

        return "webSocket";
    }

    @GetMapping("/rest")
    public String rest(@Autowired Model model) {

        model.addAttribute("title", "Что такое REST");

        return "rest";
    }
}
