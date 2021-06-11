package com.maxkorte.tierarztpraxis.controller;

import com.maxkorte.tierarztpraxis.repositories.EigentuemerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eigentümer")
public class EigentuemerController {
    private final EigentuemerRepository er;

    public EigentuemerController(EigentuemerRepository er) {
        this.er = er;
    }

    @GetMapping({"", "/"})
    public String index(Model model) {
        model.addAttribute("eigentuemer", er.findAll());
        return "eigentuemer/index";
    }
}
