package com.maxkorte.tierarztpraxis.controller;

import com.maxkorte.tierarztpraxis.repositories.TierarztRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tierärzte")
public class Tierarztcontroller {
    private final TierarztRepository tar;

    public Tierarztcontroller(TierarztRepository tar) {
        this.tar = tar;
    }

    @GetMapping({"", "/"})
    public String index(Model model) {
        model.addAttribute("tieraerzte", tar.findAll());
        return "tierarzt/index";
    }
}
