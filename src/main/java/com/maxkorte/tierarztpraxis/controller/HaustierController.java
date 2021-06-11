package com.maxkorte.tierarztpraxis.controller;

import com.maxkorte.tierarztpraxis.repositories.HaustierRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/haustiere")
public class HaustierController {
    private final HaustierRepository htr;

    public HaustierController(HaustierRepository htr) {
        this.htr = htr;
    }

    @GetMapping({"", "/"})
    public String index(Model model) {
        model.addAttribute("haustiere", htr.findAll());
        return("haustier/index");
    }
}
